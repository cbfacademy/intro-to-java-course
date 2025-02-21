# Software Development Processes

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

A simple project to practice writing JUnit 5 tests.

This short guide describes:

- [Getting Started][4]
- [Exercise 1][5]
- [Exercise 2][6]
- [Exercise 3][7]

## Getting Started

In your terminal, navigate to the `software-dev-processes` directory, then run the following command to compile the application:

```shell
./mvnw clean validate
```

If you're using the Windows Command Prompt, run this command instead:

```shell
mvnw clean validate
```

You should see the following console output:

```bash
$ ./mvnw clean validate

[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< com.cbfacademy:software-dev-processes >-----------------
[INFO] Building software-dev-processes 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom
[More download messages...]
[INFO] 
[INFO] --- maven-clean-plugin:3.2.0:clean (default-clean) @ software-dev-processes ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.pom
[More download messages...]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.155 s
[INFO] Finished at: 2022-11-03T20:56:09Z
[INFO] ------------------------------------------------------------------------
```

## Exercise 1

Examine the class implemented in `src/main/java/com/cbfacademy/Calculator.java`.
Create a test class at `src/test/java/com/cbfacademy/CalculatorTest.java`.
Write tests to ensure the Calculator can correctly multiply two numbers.\
Think of all possible scenarios, and write a test for each of the scenarios you come up with.

To run the tests, use the following command:

```shell
./mvnw clean test
```

To run a specific test method, you can modify the command to include the test class and method. For example, to run a method called `testAddition` in the `CalculatorTest` class, use the following command:
```shell
./mvnw clean test -Dtest=CalculatorTest#testAddition
```

Or for the Windows Command Prompt:
```shell
mvnw clean test -Dtest=CalculatorTest#testAddition
```

Once all your tests are passing, commit your changes.

## Exercise 2

Write tests to ensure the Calculator can divide two numbers.\
Think of all possible scenarios, and write a test for each of the scenarios.\
One of the scenarios should uncover a flaw in the Calculator implementation.

Run the tests, e.g.:
```shell
./mvnw clean test -Dtest=CalculatorTest#testDivision
```

Or for the Windows Command Prompt:
```shell
mvnw clean test -Dtest=CalculatorTest#testDivision
```

Once all your tests are passing, commit your changes.

## Exercise 3

Add more scenarios to cover the Calculator's addition and subtraction functionalities.

Once all your tests are passing, commit your changes and push your branch to GitHub.

Enjoy working on your exercise! :smiley:

[1]: https://docs.oracle.com/javase/21/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/
[4]: #getting-started
[5]: #exercise-1
[6]: #exercise-2
[7]: #exercise-3
