# Use an official OpenJDK runtime as the base image
FROM openjdk:17
EXPOSE 8081

# Copy the compiled JAR file into the container at the specified location
ADD target/internV1-0.0.1-SNAPSHOT.jar internV1-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/internV1-0.0.1-SNAPSHOT.jar"]

# Specify the command to run your Spring Boot application
CMD ["-start"]
