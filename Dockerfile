FROM maven:3.3-jdk-8

WORKDIR /usr/src/app

ADD src /usr/src/app/src
ADD pom.xml /usr/src/app

CMD ["mvn jetty:run"]

