FROM carsharing/alpine-oraclejdk8-bash
VOLUME /tmp
ADD demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]