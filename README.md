# Spring Boot Job Portal API

## Overview
This project is a RESTful backend API for a Job Portal application built using Spring Boot.  
It allows users to register, authenticate using JWT-based authentication, and manage job postings.  
The application follows a layered architecture and is containerized using Docker for easy deployment.

---

## Features

- User authentication and authorization using Spring Security + JWT
- Secure REST APIs
- CRUD operations for job postings
- Aspect-Oriented Programming (AOP) for logging and validation
- Dockerized application
- Clean layered architecture

---

## Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- Hibernate
- PostgreSQL / H2
- Docker
- Maven

---

## Project Architecture

The application follows a layered architecture:

Controller → Service → Repository → Database

### Layers

**Controller Layer**
- Handles HTTP requests
- Exposes REST endpoints

**Service Layer**
- Contains business logic
- Processes data before saving or returning

**Repository Layer**
- Handles database operations
- Uses Spring Data JPA

**Model Layer**
- Defines entities and DTOs

---

## Security

Authentication is implemented using JWT (JSON Web Token).

### Security Flow

User Login  
↓  
Spring Security Authentication  
↓  
JWT Token Generated  
↓  
Client sends JWT in Authorization Header  
↓  
JWT Filter validates token  
↓  
Access granted to protected endpoints

Example header:

Authorization: Bearer <JWT_TOKEN>

---

## API Endpoints

### Authentication

POST /auth/register  
POST /auth/login  

### Jobs

GET /jobs  
GET /jobs/{id}  
POST /jobs  
PUT /jobs/{id}  
DELETE /jobs/{id}  

---

## Running the Application

### 1. Clone repository

```
git clone https://github.com/abhisingh070/springboot-jobportal-api.git
cd springboot-jobportal-api
```

### 2. Run using Maven

```
mvn spring-boot:run
```

### 3. Run using Docker

Build Docker image

```
docker build -t jobportal-api .
```

Run container

```
docker run -p 8080:8080 jobportal-api
```

---

## Configuration

Update database configuration in `application.properties`

Example:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/jobportal
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

## Future Improvements

- Role-based authorization
- API documentation using Swagger / OpenAPI
- Pagination and filtering
- CI/CD pipeline
- Cloud deployment

---

## Author

Abhishek Kumar
