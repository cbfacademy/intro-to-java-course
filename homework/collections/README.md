# Working With Java Collections

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][4]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][5]

The goal of this programming assignment is to practise working with:
- the [Java Collections Framework][2]
- and learn to distinguish working with interfaces and actual implementations

## :books: Java Collections

Implement all the methods of the [`CollectionsAssignment` class][3]. 
Each method has documentation that describes what it should do.

To verify that your code works as expected, run the `CollectionsAssignmentTest` tests.

In your terminal, ensure that you are in the `collections` homework folder.
Then run the following command in your terminal.

```shell
./mvnw clean test
```

If you are on Windows, run this command instead:

```shell
mvnw.cmd clean test
```

## :pushpin: Java Interfaces

Consider the four core interfaces, `Set`, `List`, `Queue`, and `Map`.

For each of the following four assignments, **specify which of the four core interfaces is best-suited**, and **explain how to use it to implement the assignment**.

1. Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month, an employee will be chosen at random from these records to receive a free toy.

2. WTI has decided that each new product will be named after an employee but only first names will be used, and each name will be used only once. Prepare a list of unique first names.

3. WTI decides that it only wants to use the most popular names for its toys. Count up the number of employees who have each first name.

4. WTI acquires season tickets for the local lacrosse team, to be shared by employees. Create a waiting list for this popular sport.


[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://docs.oracle.com/javase/tutorial/collections/intro/index.html
[3]: https://github.com/cbfacademy/intro-to-java-course/blob/main/homework/collections/src/main/java/com/cbfacademy/CollectionsAssignment.java
[4]: https://junit.org/junit5/
[5]: https://maven.apache.org/