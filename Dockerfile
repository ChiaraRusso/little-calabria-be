FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} little-italy-be.jar
ENTRYPOINT ["java","-jar","/little-italy-be.jar"]