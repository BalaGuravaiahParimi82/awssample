FROM openjdk:8
EXPOSE 8080
ADD target/awssample.jar awssample.jar
ENTRYPOINT ["java","-jar","/awssample.jar"]