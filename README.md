🧾## Project Summary:- 
☑️AuthService – Spring Boot JWT Authentication Microservice
⏩AuthService is a secure, production-ready microservice developed using Spring Boot that handles user authentication and authorization through JWT (JSON Web Tokens). The project is designed following best practices in API security and layered architecture, suitable for integration in large-scale microservice ecosystems.

✅It provides a seamless interface for:-
⏩User registration with secure password encryption (BCrypt).
⏩User login that generates a signed JWT token.
⏩Token-based authentication for securing endpoints.
⏩Role-based access control using Spring Security.
⏩Centralized exception handling, reusable response models, and separation of concerns via DTO-Entity-Service-Controller layering.

☑️The project is modular, easy to extend, and integrates cleanly with other microservices via REST APIs. It also includes a JWT validation filter that intercepts incoming requests, extracts tokens from headers, and validates them before granting access to protected resources.

⚙️ Key Highlights:-
🔐 JWT Authentication: Stateless, secure login using signed tokens.
🧱 Layered Architecture: Clean separation between controller, service, and repository.
🔄 Spring Security: Configurable role-based access with custom JWT filters.
💡 BCrypt Password Encoding: Encrypts passwords before storage.
⚙️ RESTful APIs: Well-structured endpoints for login, registration, and secured content.
🚀 Ready for Integration: Can be used as a central authentication service in a microservices environment.

📚 Topics:-
⏩Spring Boot.
⏩JWT Token-based Authentication.
⏩Spring Security with Role-based Access Control.
⏩RESTful API Design.
⏩DTO and Entity separation.
⏩Authentication Manager with UsernamePasswordAuthenticationToken.
⏩Secure password hashing.
⏩Custom JWT filters and security configuration.

## 🔧 Tech Stack:-
- Spring Boot
- Spring Security
- JWT
- Maven
- Lombok
- MySQL (or H2/in-memory)

## ✨ Features:-
- User Registration & Login
- Password Encryption with BCrypt
- JWT Token Creation and Validation
- Role-based Access Control
- Secure API Endpoints
- Layered Architecture (Controller, Service, Repository, DTO)

## 📁 Project Structure:-
com.authservice
│
├── config # Spring Security and JWT configuration
├── controller # REST controllers (Auth, Welcome)
├── dto # Data Transfer Objects
├── entity # JPA entities
├── repository # Spring Data JPA Repositories
├── service # Business logic services
└── AuthserviceApplication # Main application class

## 🧪 How to Run:-
1. Clone the repo  
2. Run with Maven:
3. Use tools like Postman to test `/register` and `/login` APIs.
## 🚀 Endpoints
| Method | Endpoint     | Description        |
|--------|--------------|--------------------|
| POST   | /register    | Register a new user |
| POST   | /login       | Authenticate and receive JWT |
| GET    | /welcome     | Protected route (requires valid token) |
---
## 📜 License:-
MIT License

📚 Key Classes:-
✅File	Description
⏩AuthController.-------------> java	Handles login and registration
⏩JwtService.-----------------> java	Creates and validates JWT tokens
⏩JwtFilter.------------------> java	Checks token for secured endpoints
⏩AppSecurityConfig.java------>	Spring Security config
⏩User.java------------------->	JPA Entity
⏩UserDto, LoginDto.---------->	DTOs for safe data transfer
