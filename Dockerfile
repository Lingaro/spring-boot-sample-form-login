FROM openjdk:8-alpine
WORKDIR /opt/app/
COPY target/app.jar .
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]