FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY src/main/resources/birthdays.json /app/birthdays.json
COPY src/main/resources/employees.json /app/employees.json
ENTRYPOINT ["java", "-jar", "app.jar"]