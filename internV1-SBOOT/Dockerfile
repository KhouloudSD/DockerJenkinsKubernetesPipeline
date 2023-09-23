# Use an official OpenJDK runtime as the base image
FROM openjdk:17

# Set the workng directory in the container
EXPOSE 8080

# Copy the compiled JAR file into the container at the specified location
ADD target/devopsdemo.jar devopsdemo.jar

ENTRYPOINT ["java","-jar","/devopsdemo.jar"]

# Specify the command to run your Spring Boot application
CMD ["-start"]
