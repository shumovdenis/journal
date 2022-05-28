FROM openjdk:19-jdk-alpine

EXPOSE 8080

ADD target/journal-0.0.1-SNAPSHOT.jar journal.jar

CMD ["java", "-jar", "/journal.jar"]