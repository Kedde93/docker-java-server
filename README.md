#Preparations

First create a docker volume (For caching dependencies used by maven)

`docker colume create --name maven-repo`

# Build the image. 

In the root of the repo run this command

`docker build -t java-webapp-training .`

#How to run tests with image

`docker run --rm -v maven-repo:/root/.m2 -t -p 8080:8080 praqma/java-webapp-training mvn test`

#How to package app 

The package .war file that can be deoployed on a Java EE server will be placed in the `target` folder.

`docker run --rm -v maven-repo:/root/.m2 -t -p 8080:8080 pramqa/java-webapp-training mvn clean package`

#How to run app (Can be used for testing as well)

This command launches the app. Give it a moment to boot up

`docker run -v maven-repo:/root/.m2 -t -d -p 8080:8080 praqma/java-webapp-training mvn jetty:run`


