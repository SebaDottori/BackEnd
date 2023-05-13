FROM amazoncorretto:8-alpine-jdk

COPY target/HSDI-0.0.1-SNAPSHOT.jar hsdi.app.jar

ENTRYPOINT ["java","-jar","/hsdi.app.jar"]

EXPOSE 8080
