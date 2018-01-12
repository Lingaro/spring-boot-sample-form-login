FROM openjdk:8-alpine
RUN apk add --no-cache curl
WORKDIR /opt/app/
COPY target/app.jar .
EXPOSE 8080
HEALTHCHECK --interval=60s --timeout=3s --retries=3 --start-period=30s \
    CMD curl -f http://localhost:8080/api/status/health || exit 1
ENTRYPOINT [ "java", "-jar", "app.jar" ]