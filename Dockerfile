FROM openjdk:17-jdk-alpine
ADD target/library.jar library.jar
EXPOSE 9090
ENTRYPOINT ["sh","-c","java -jar /library.jar"]
