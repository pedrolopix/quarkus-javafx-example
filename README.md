# Getting started with Quarkus JavaFx

This is a minimal javafx application that access Quarkus API's.

Under the hood, this demo uses:

- `@QuarkusMain` to enable a custom main class

## Requirements

To compile and run this demo you will need:

- JDK 17.x+
- Maven 3.8.x+

### Configuring JDK 17

Make sure that `JAVA_HOME` environment variables have
been set, and that a JDK 17.x+ `java` command is on the path.

## Building the application

Launch the Maven build on the checked out sources of this demo:

> mvn package


Then run it:


> java -jar target/quarkus-app/quarkus-run.jar

