#FROM openjdk:17-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#COPY src/main/resources/birthdays.json /app/birthdays.json
#COPY src/main/resources/employees.json /app/employees.json
#ENTRYPOINT ["java", "-jar", "app.jar"]

#FROM maven:3.3-jdk-8
#WORKDIR /usr/src/app
#ARG JAR_FILE=target/*.jar
#COPY . /usr/src/app
#COPY ${JAR_FILE} app.jar
#COPY src/main/resources/birthdays.json /usr/src/app/birthdays.json
#COPY src/main/resources/employees.json /usr/src/app/employees.json
##RUN mvn package
#ENV PORT 5000
#EXPOSE $PORT
#CMD [ "sh", "-c", "mvn -Dserver.port=${PORT} spring-boot:run" ]


#FROM maven:3.8.4-openjdk-11-slim
#COPY . /app
##RUN mvn dependency:go-offline -B
#RUN mvn clean install
#FROM openjdk:11-jre-slim
###ARG JAR_FILE=/usr/src/app/target/*.jar
##COPY ${JAR_FILE} /usr/src/app/app.jar
#COPY src/main/resources/birthdays.json /app/birthdays.json
#COPY src/main/resources/employees.json /app/employees.json
#RUN echo "El directorio actual es: ${pwd}"
#ENTRYPOINT ["java", "-jar", "/app/target/bago-backend-0.0.1-SNAPSHOT.jar"]

#FROM maven:3.8.4-openjdk-11-slim
#COPY . /app
#WORKDIR /app
#RUN mvn clean install
#FROM openjdk:11-jre-slim
#COPY --from=0 /app/target/bago-backend-0.0.1-SNAPSHOT.jar /app/bago-backend-0.0.1-SNAPSHOT.jar
#COPY src/main/resources/birthdays.json /app/birthdays.json
#COPY src/main/resources/employees.json /app/employees.json
#RUN ls /app
#ENTRYPOINT ["java", "-jar", "/app/bago-backend-0.0.1-SNAPSHOT.jar"]


#FROM maven:3.6.3-openjdk-11
#WORKDIR /app
#COPY . /app
#RUN mvn clean install
#ARG JAR_FILE=/app/target/*.jar
#RUN ls /app
#ENTRYPOINT ["java", "-jar"]
#CMD ["echo", "ls"]

FROM maven:3.6.3-openjdk-11
COPY . /app
WORKDIR /app
RUN mvn clean install
RUN sleep 5
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY src/main/resources/birthdays.json /app/birthdays.json
COPY src/main/resources/employees.json /app/employees.json
ENTRYPOINT ["java", "-jar", "app.jar"]