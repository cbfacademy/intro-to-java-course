# Input-Output in Java

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise I/O concepts:
- Reading from a file
- Writing to a file

For the exercises below, we've provided the starter project above.

## :pushpin: File Reading

Write a program that uses a `FileReader` to read the content of a file, and print it to the screen, line by line.

We've provided the input `exercise.txt` file in this project's resources folder.

## :pushpin: File Writing

Expand on the previous program, and use a `FileWriter` to copy the content of the `exercise.txt` to a new file.

The output file should be created in this project's resources folder.

## :pushpin: `java.nio.*`

Using the `java.nio.*` classes, improve on the previous program.

## :pushpin: File Content Handling

Create a program to "invert" the contents of a text file.
We've provided the input `exercise.txt` file in this project's resources folder.

Write code that reads the content of the `exercise.txt`, then writes them to an `inverted.txt` file. 

It should contain the same lines as the original but in reverse order:
- the first line will be the last one, 
- the second will be the penultimate, and so on, until the last line of the original file, which should appear in the first position of the resulting file.

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/