#Definir hospedador de la api spring
FROM adoptopenjdk/openjdk11:alpine-jre

COPY ./target/apimoneda-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
