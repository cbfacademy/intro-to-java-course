# Exception Handling

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of this exercise is to practise:
- Creating custom exceptions
- Handling exceptions

For the exercises below, we've provided the starter project above.

## :pushpin: Exceptions

Create a class called `FileExtension`, with a `check` method that takes a `fileName` as a `String`.

The `check` method should:
- return `1` when the file extension is `.java`
- return `0` when the file extension is not `.java`
- throw a custom exception (that you'll create) when the file name is `null` or an empty string.

Then, in the `App::main` method, write code that creates a map as follows:
- it takes a list of file names
- checks each file's extension and maps the returned value to the filename
- maps `-1` when an exception occurs

**<ins>Example</ins>**

For the following list of file names: `List.of("App.java", "App.txt", null, "App.md")`, the program should create 
a map with the following entries

```txt
{1, "App.java"},
{0, "App.txt"},
{-1, null},
{0, "App.md"}
```

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/