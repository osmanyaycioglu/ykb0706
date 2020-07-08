FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/node-discovery-server-1.0.0.jar node-discovery-server-1.0.0.jar
ENV JAVA_OPS="-Xmx256m -Xms256m"
EXPOSE 5555
ENTRYPOINT [ "sh","-c","java ${JAVA_OPS} -Dconfig.url=${CONFIG_URL} -jar node-discovery-server-1.0.0.jar" ]