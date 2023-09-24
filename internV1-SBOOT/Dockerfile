# Use an official OpenJDK runtime as the base image
FROM openjdk:17
EXPOSE 8081

# Copy the compiled JAR file into the container at the specified location
ADD target/spring-boot-docker.jar spring-boot-docker.jar

ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]

# Specify the command to run your Spring Boot application
CMD ["-start"]
