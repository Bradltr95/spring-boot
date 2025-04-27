# Spring Boot Engineers Project

This is a Spring Boot application designed to manage software engineers and their tech stacks. The project uses PostgreSQL as the database and is containerized with Docker.

## Features

- **Spring Boot**: Backend framework for building RESTful APIs.
- **PostgreSQL**: Relational database for storing engineer data.
- **Docker**: Containerization for consistent development and deployment.
- **Gradle**: Build automation and dependency management.
- **JPA**: Simplified database interaction with Hibernate.

## Prerequisites

- Java 17+
- Docker & Docker Compose
- - Gradle
- PostgreSQL client (optional)

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Bradltr95/spring-boot-engineers.git
   cd spring-boot-engineers
   ```
2. Start the Database: Use Docker Compose to start the PostgreSQL container:
    ```bash
    docker-compose up -d
    ```
3. Run the Application: Use Gradle to build and run the application:
    ```bash
    ./gradlew bootRun
    ```
4. Access the Application:

   - API Base URL: http://localhost:8080
   - Database: localhost:5332 (username: bradltr, password: password)

## Configuration

- Database: Configured in src/main/resources/application.properties.
- Docker Compose: Configured in docker-compose.yml.

### Testing
Run the tests using Gradle:

```bash
./gradlew test
```

## Project Structure
- **src/main/java:** Application source code.
- **src/test/java:** Unit and integration tests.
- **docker-compose.yml:** Docker configuration for PostgreSQL.
- **src/main/resources/application.properties:** Application configuration.

## License
This project is licensed under the MIT License.