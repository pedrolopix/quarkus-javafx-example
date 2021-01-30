# Getting started with Quarkus JavaFx

This is a minimal javafx application that access Quarkus API's.

Under the hood, this demo uses:

- `@QuarkusMain` to enable a custom main class

## Requirements

To compile and run this demo you will need:

- JDK 11+
- Maven 3.6.3+

### Configuring JDK 11

Make sure that `JAVA_HOME` environment variables have
been set, and that a JDK 11+ `java` command is on the path.

## Building the application

Launch the Maven build on the checked out sources of this demo:

> mvn package


Then run it:

> java -jar target/quarkus-javafx-example-1.0-runner.jar

