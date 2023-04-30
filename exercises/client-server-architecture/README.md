# Client-Server Architecture

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise:
- communication with a remote server
- using the `java.net.*` package capabilities

For this assignment, we've provided the starter project above.

## :earth_africa: Using URLs

Create a program that connects to the CBF academy website, then prints its content to the screen line by line.

Whenever possible, use the try-with-resources construct we saw earlier in the course, and ensure to release all resources.

## :phone: Client & Server

Create a simple program with two classes:
- a `ExerciseServer` class which uses a `ServerSocket` to listen for connections on `localhost:4040`, then prints message it receives on the screen.
- a `ExerciseClient` class which requests a connection to server, sends a simple text message to the server.

Ensure to release all resources at the end of your program.

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/