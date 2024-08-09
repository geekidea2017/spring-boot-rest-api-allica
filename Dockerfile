FROM openjdk:17-jdk-alpine
WORKDIR /app

COPY target/spring-boot-rest-api-allica-0.0.1-SNAPSHOT.jar spring-boot-rest-api-allica-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-boot-rest-api-allica-0.0.1-SNAPSHOT.jar"]
