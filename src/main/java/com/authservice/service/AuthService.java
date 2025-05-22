package com.authservice.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.authservice.dto.APIResponse;
import com.authservice.dto.UserDto;
import com.authservice.entity.User;
import com.authservice.repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	public APIResponse<String> register(UserDto userDto){
	
		//API Response object.
		APIResponse<String> response = new APIResponse<>();
		
		//Check whether user name exists.
		if(userRepository.existsByUsername(userDto.getUsername())) {
			response.setMessage("User with this username exists");
			response.setStatus(500);
			response.setData("User with user name already exists");
			return response;
		}
		
		//Check whether Email exists.
		if(userRepository.existsByEmail(userDto.getEmail())) {
			response.setMessage("Registration Failed");
			response.setStatus(500);
			response.setData("User with user name already exists");
			return response;
		}
		
		//Encode the password before saving that to the database.
		String encryptedPassword = passwordEncoder.encode(userDto.getPassword());
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		user.setPassword(encryptedPassword);
		user.setRole("ROLE_ADMIN");
		User savedUser = userRepository.save(user);
		if (savedUser==null) {
			//Custom Exception
		}

		response.setMessage("Registration Completed");
		response.setStatus(201);
		response.setData("User has been registered");
		return response;
		
		//finally save the user and return response as API response.
	}
}