FROM openjdk:11
WORKDIR /app
COPY app/ .
ENTRYPOINT ["/bin/sh", "-c", "./mvnw package && java -jar target/demo-0.0.1.jar"]