FROM openjdk:8-jre-alpine
ADD target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["sh", "-c", "java -jar docker-spring-boot.jar"]