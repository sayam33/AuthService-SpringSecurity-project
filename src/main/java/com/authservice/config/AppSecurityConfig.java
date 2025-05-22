package com.authservice.config;

import com.authservice.service.CustomUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	@Autowired
    private CustomUserDetailsService customUserDetailsService;
    
	@Autowired
	private JwtFilter jwtFilter;
	
	private String[] openUrl = {
			"/api/v1/auth/register",
			"/api/v1/auth/login",
    		"/v3/api-docs/**",
            "/swagger-ui/**",
            "/swagger-ui.html",
            "/swagger-resources/**",
            "/webjars/**"
	};
	
    @Bean
	public PasswordEncoder getEncodedPassword() {
		return new BCryptPasswordEncoder();
	}

    
    @Bean
	public AuthenticationManager authManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}	
 
    
    @Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(customUserDetailsService);
		authProvider.setPasswordEncoder(getEncodedPassword());
		return authProvider;
    }

    
    @Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {
	    http.authorizeHttpRequests(req -> 
	            req.requestMatchers(openUrl).permitAll()
	            .requestMatchers("/api/v1/welcome/message").hasAnyRole("USER","ADMIN")
	            .anyRequest().authenticated()
        ).authenticationProvider(authProvider())
        .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	    return http.csrf().disable().build();
   }
}

//To Access Swagger - Run the Project
//http://localhost:8080/swagger-ui.html
//Or (sometimes):
//http://localhost:8080/swagger-ui/index.html