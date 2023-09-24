# Use an official OpenJDK runtime as the base image
FROM openjdk:17
EXPOSE 8090

# Copy the compiled JAR file into the container at the specified location
ADD target/devops-integration.jar devops-integration.jar

ENTRYPOINT ["java","-jar","/devops-integration.jar"]

# Specify the command to run your Spring Boot application
CMD ["-start"]
