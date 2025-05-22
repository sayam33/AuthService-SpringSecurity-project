# AuthService - Spring Boot JWT Authentication

This project is a microservice for handling user authentication using Spring Boot and JWT (JSON Web Tokens). It provides secure REST APIs for user registration and login, protected via Spring Security.

📚 Topics:-
Spring Boot.
JWT Token-based Authentication.
Spring Security with Role-based Access Control.
RESTful API Design.
DTO and Entity separation.
Authentication Manager with UsernamePasswordAuthenticationToken.
Secure password hashing.
Custom JWT filters and security configuration.

## 🔧 Tech Stack
- Spring Boot
- Spring Security
- JWT
- Maven
- Lombok
- MySQL (or H2/in-memory)

## ✨ Features
- User Registration & Login
- Password Encryption with BCrypt
- JWT Token Creation and Validation
- Role-based Access Control
- Secure API Endpoints
- Layered Architecture (Controller, Service, Repository, DTO)

## 📁 Project Structure
com.authservice
│
├── config # Spring Security and JWT configuration
├── controller # REST controllers (Auth, Welcome)
├── dto # Data Transfer Objects
├── entity # JPA entities
├── repository # Spring Data JPA Repositories
├── service # Business logic services
└── AuthserviceApplication # Main application class

## 🧪 How to Run
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
## 📜 License
MIT License

📚 Key Classes
File	Description
AuthController.-------------> java	Handles login and registration
JwtService.-----------------> java	Creates and validates JWT tokens
JwtFilter.------------------> java	Checks token for secured endpoints
AppSecurityConfig.java------>	Spring Security config
User.java------------------->	JPA Entity
UserDto, LoginDto.---------->	DTOs for safe data transfer
