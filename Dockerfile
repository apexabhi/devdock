FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/DevopsDocker-0.0.1-SNAPSHOT.jar /app/DevopsDocker-0.0.1-SNAPSHOT.jar

EXPOSE 8092

CMD ["java", "-jar", "DevopsDocker-0.0.1-SNAPSHOT.jar"]