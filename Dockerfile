FROM eclipse-temurin:21-jdk-alpine
MAINTAINER Jin Wang
RUN mkdir /opt/app
COPY target/*.jar /opt/app/application.jar
CMD ["java", "-jar", "/opt/app/application.jar"]
EXPOSE 8080