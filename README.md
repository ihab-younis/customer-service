# Customer Service
## Description
    Providing CRUD operations for the customer service

### Framework
Spring Boot is used to create this microservice, yeeay! ;) <br>

### Language
English is what i used.. kidding XD .. <br>
JAVA 17 is the programming language, some groovy is used implicitly though by gradle

### Build
Gradle is the packaging and builder tool for this microservice. <br>
To build, you can run "./gradlew clean build" on the project directory

### Lombok
Lombok is used to make getters and setters gets generated in the compilation time which makes the code cleaner.

### Database 
H2 database is used on memory, hence you would expect all tables are wiped every time you kill the app <br>
After running the app you can access the following link to play with the DB, have fun and take care of your memory ;)<br>
http://localhost:8080/h2-console/

### Testing
Junit 5 with spring used for testing, included UTs, ITs.<br>
The tests runs with the build, also you can run it individually through the IDE

### API 
API documentation/Testing http://localhost:8080/swagger-ui/index.html

### CI/CD
CI : build->(Unit Tests, Integration Tests)->Test Acceptance <br>
CD : NONE

### Run
port : 8080<br>
Run "./gradlew bootRun" on the project directory<br>
OR pull it to IDE e.g. intelli (developed with) and run CustomerServiceApplication.java

### Observability 
The Spring actuator is used for getting insights about the performance and some basic metrics <br>
For health http://localhost:8080/actuator/health<br>
you can check the response metrics using the default spring boot actuator by running<br>
http://localhost:8080/actuator/metrics/http.server.requests?tag=uri:<br>
and postfix the endpoint to get metrics, e.x.<br>
http://localhost:8080/actuator/metrics/http.server.requests?tag=uri:/customer/v1/all

### Containerization
Used Docker to containerize. don't get excited, it is not working :( I'm human i can do mistakes! <br>
Anyway, you need to do the following :
- You need to install docker daemon on local machine, fancy way is installing the docker desktop https://www.docker.com/products/docker-desktop/
- then you should build the container image and run it. (docker build, and docker run), attempted multiple times but with no chance.. good luck!

### Consumer
There is another app to consume this customer service, you can get it from https://github.com/ihab-younis/customer-consumer