FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/faceclone.jar /faceclone/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/faceclone/app.jar"]
