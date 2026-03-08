# java-application
A simple Spring Boot application that displays a random number in the browser.

## Overview
This application demonstrates a minimal Spring Boot REST API that generates and displays a random number (0-999) each time the page is accessed or refreshed.

## Project Structure
```
java-application/
├── pom.xml
├── src/
│   └── main/
│       ├── java/com/example/
│       │   ├── Application.java
│       │   └── RandomController.java
│       └── resources/
│           └── application.properties
└── README.md
```

## Components

### 1. pom.xml
Maven configuration file that defines:
- Project metadata (groupId, artifactId, version)
- Spring Boot parent dependency (v3.2.0)
- Spring Boot Web Starter dependency
- Maven plugin for building and running the application

### 2. Application.java
Main entry point of the Spring Boot application:
- `@SpringBootApplication` annotation enables auto-configuration
- `main()` method launches the application

### 3. RandomController.java
REST controller that handles HTTP requests:
- `@RestController` marks it as a web controller
- `@GetMapping("/")` maps the root URL to the method
- Generates a random number (0-999) on each request
- Returns HTML formatted response

### 4. application.properties
Configuration file:
- Sets server port to 8080

## Prerequisites
- Java 17 or higher
- Maven 3.6+

## How to Run

1. **Using Maven:**
   ```bash
   mvn spring-boot:run
   ```

2. **Build and run JAR:**
   ```bash
   mvn clean package
   java -jar target/java-application-1.0.0.jar
   ```

## Access the Application
Open your browser and navigate to:
```
http://localhost:8080
```

Each page load or refresh will display a new random number.

## How It Works
1. Spring Boot starts an embedded Tomcat server on port 8080
2. When you access the root URL (/), the RandomController handles the request
3. A new Random object generates a number between 0-999
4. The number is returned as an HTML response
5. Your browser displays the formatted result
