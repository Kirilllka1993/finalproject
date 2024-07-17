FROM openjdk:17-oracle as jdk17
COPY target/testweb-*.jar /app.jar