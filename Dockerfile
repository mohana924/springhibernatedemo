FROM openjdk:17.0.2-slim-buster
WORKDIR /app 
COPY target/*.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]