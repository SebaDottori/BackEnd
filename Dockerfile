FROM amazoncorretto:11-alpine-jdk
MAINTAINER HSDI
COPY target/HSDI-0.0.1-SNAPSHOT.jar hsdi.app.jar
ENTRYPOINT ["java","-jar","/hsdi.app.jar"]
