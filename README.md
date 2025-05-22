🧾## Project Summary:- 
☑️AuthService – Spring Boot JWT Authentication.
⏩AuthService is a standalone Spring Boot application that handles user authentication using JWT (JSON Web Tokens). It provides secure REST APIs for user registration, login, and role-based access control through Spring Security.
⏩The application demonstrates how to implement stateless authentication, password encryption, and JWT token management using best practices.

✅It provides a seamless interface for:-
⏩User registration with secure password encryption (BCrypt).
⏩User login that generates a signed JWT token.
⏩Token-based authentication for securing endpoints.
⏩Role-based access control using Spring Security.
⏩Centralized exception handling, reusable response models, and separation of concerns via DTO-Entity-Service-Controller layering.

⚙️ Key Highlights:-
🔐 JWT Authentication: Stateless, secure login using signed tokens.
🧱 Layered Architecture: Clean separation between controller, service, and repository.
🔄 Spring Security: Configurable role-based access with custom JWT filters.
💡 BCrypt Password Encoding: Encrypts passwords before storage.
⚙️ RESTful APIs: Well-structured endpoints for login, registration, and secured content.

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
- MySQL

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
