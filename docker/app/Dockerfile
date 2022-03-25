# FROM maven:3.8.4-jdk-11 as builder
FROM openjdk:11
WORKDIR /app
COPY app/ .
RUN ./mvnw package
ENTRYPOINT ["java","-jar","./target/demo-0.0.1.jar"]