FROM maven:3.3-jdk-8

WORKDIR /usr/src/app

CMD ["mvn jetty:run"]

