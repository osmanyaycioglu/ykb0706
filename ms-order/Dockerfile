FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/ms-order-1.0.0.jar ms-order-1.0.0.jar
ENV JAVA_OPS="-Xmx256m -Xms256m"
EXPOSE 10000
ENTRYPOINT [ "sh","-c","java ${JAVA_OPS} -Dconfig.url=${CONFIG_URL} -jar ms-order-1.0.0.jar" ]