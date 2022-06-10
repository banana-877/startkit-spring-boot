FROM openjdk:11
WORKDIR /app
COPY . .
ENV SPRING_DATASOURCE_URL jdbc:mysql://db:3306/demo
ENV SPRING_DATASOURCE_USERNAME demo_u
ENV SPRING_DATASOURCE_PASSWORD demo_pw
EXPOSE 8080
ENTRYPOINT ["/bin/sh", "-c", "./mvnw package && java -jar target/demo-0.0.1.jar"]