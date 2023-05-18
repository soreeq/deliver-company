
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} infrastructure.jar
ENTRYPOINT ["java","-jar","/infrastructure.jar"]