FROM openjdk:8-alpine
WORKDIR /opt/app/
COPY target/app.jar .
ENTRYPOINT [ "java", "-jar", "app.jar" ]