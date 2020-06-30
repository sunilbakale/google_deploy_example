FROM openjdk:8
ADD target/docker_spring.jar docker_spring.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker_spring.jar"]