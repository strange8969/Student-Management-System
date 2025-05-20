# Student Management System

A comprehensive web-based application for managing student information, built with Spring Boot.

## Overview

The Student Management System provides an easy-to-use interface for educational institutions to maintain and manage student records. This system streamlines administrative tasks related to student data management with a clean, Bootstrap-powered UI.

## Technologies Used

- **Java 21**
- **Spring Boot 3.4.5**
- **Spring Data JPA** - For database operations
- **Spring MVC** - For web layer
- **Thymeleaf** - For server-side templating
- **MySQL** - Database
- **Maven** - Build tool
- **Bootstrap 4** - Frontend framework
- **Spring Boot Actuator** - For application monitoring and management

## Features

- Student registration and profile management
- View all students in a centralized dashboard
- Add new students to the system
- Update existing student information
- Delete student records
- Responsive user interface for all device sizes
- RESTful API services
- Monitoring endpoints through Spring Boot Actuator

## Screenshots

(Add screenshots of your application here)

## Getting Started

### Prerequisites

- JDK 21
- MySQL server
- Maven

### Database Setup

1. Create a MySQL database named `sms`
2. The application will automatically create the required tables

### Installation and Setup

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/student-management-system.git
   cd student-management-system
   ```

2. Configure MySQL database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/sms?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. Build the application:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```
   
   Alternatively, you can run the JAR file:
   ```
   java -jar target/student-management-system-0.0.1-SNAPSHOT.jar
   ```

5. Access the application by navigating to `http://localhost:8080` in your web browser

## Project Structure

The application follows a standard Spring Boot project structure:
- `src/main/java` - Java source files containing controllers, services, repositories, and models
- `src/main/resources` - Configuration files and Thymeleaf templates
- `src/main/resources/templates` - HTML templates for the web interface
- `src/main/resources/static` - Static resources like CSS, JavaScript
- `src/test` - Test cases

## Application Flow

1. Users access the application through the web interface
2. The controller layer handles HTTP requests and delegates to service layer
3. The service layer contains business logic and interacts with repositories
4. The repository layer interacts with the MySQL database using JPA
5. Thymeleaf templates render the HTML views with data from the controller

## API Endpoints

(If your application has RESTful API endpoints, list them here)

## Configuration

The application can be configured through the `application.properties` file:
- Database connection settings
- Hibernate properties
- Logging settings
- Error handling configuration

## Error Handling

The application includes comprehensive error handling with:
- Detailed error messages
- Binding error information
- Stack traces in development environment

## Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Contact

[Your contact information]