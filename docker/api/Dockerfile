# FROM maven:3.8.4-jdk-11 as builder
FROM openjdk:11 as builder
WORKDIR /api
COPY . .
RUN ./mvnw package 

FROM openjdk:11
WORKDIR /api
COPY --from=builder /api/target ./
ENTRYPOINT ["java","-jar","./demo-0.0.1.jar"]