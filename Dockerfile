FROM openjdk:11
# copy application WAR (with libraries inside)
COPY target/docker-1.1.jar /app.jar
# specify default command
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/app.jar"]