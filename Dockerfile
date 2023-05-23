FROM maven:3.8.4-openjdk-11 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests
FROM openjdk:11-jre-slim
COPY --from=build /app/target/*.jar /app/app.jar
COPY src/main/resources/birthdays.json /app/birthdays.json
COPY src/main/resources/employees.json /app/employees.json
EXPOSE 9090
CMD ["java", "-jar", "/app/app.jar"]
