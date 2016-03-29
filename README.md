# Task

Write a program that plays 100 iterations of Rock, Paper, Scissors (https://en.wikipedia.org/wiki/Rock-paper-scissors). 
One player should always play randomly, the other should always choose rock. It should show at the end how many games each player has one and how many were a draw.

The code should have high test coverage.
Keep it simple - remember: we're not looking for the perfect "correct" solution, but a basis for discussion and development.

Technical requirements
Language: Java, tests in a JVM language of your choice
Approach: ideally "test-driven"

## Basic Concept

* Gradle 
* Micro Service 
* RESTfullish Apis 
* Swagger for Documentation
* JUnit for testing 

## Template Project

[Template](http://www.hascode.com/2015/07/integrating-swagger-into-a-spring-boot-restful-webservice-with-springfox/)

## Instructions 

Simply run the following command with Gradle:

```
./gradlew bootRun
```

to start the application
at [Swagger](http://localhost:8080/swagger-ui.html) you will find the api documantation


## CI

```
./gradlew clean build jacocoTestReport
```

This executes unit test, does checkstyle test, findbugs and generates a report for test coverage

* jacoco -> build/reports/jacoco/index.html
* checkstyle -> build/reports/checkstyle/main.html
* findbugs -> build/reports/findbugs/main.html

