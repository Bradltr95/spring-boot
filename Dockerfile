# Use a lightweight JDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the Gradle build output
COPY build/libs/spring-boot-0.0.1-SNAPSHOT.jar app.jar

# This copy is a brute force attempt to copy the entire build rather than just the single jar
#COPY . .

# Expose the application port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]