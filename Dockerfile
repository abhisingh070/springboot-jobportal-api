FROM amazoncorretto:21-alpine-jdk
COPY target/job-App.jar job-App.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "job-App.jar"]