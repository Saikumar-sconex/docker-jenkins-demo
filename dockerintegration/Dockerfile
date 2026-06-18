FROM eclipse-temurin:17-jdk
WORKDIR /app
EXPOSE 9090
COPY target/*.jar docker-jenkins.jar
ENTRYPOINT ["java", "-jar", "docker-jenkins.jar"]