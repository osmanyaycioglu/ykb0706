FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/node-config-server-1.0.0.jar node-config-server-1.0.0.jar
ENV JAVA_OPS="-Xmx256m -Xms256m"
EXPOSE 8888
ENTRYPOINT [ "sh","-c","java ${JAVA_OPS} -Dykb.git.dir=${GIT_DIR} -jar node-config-server-1.0.0.jar" ]