# Input-Output in Java

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise I/O concepts:
- Reading from a file
- Writing to a file

For the exercises below, we've provided the starter project above.

## :pushpin: File Reading

Create a class called `FileManager` with the following methods:

```java
public List<String> readFile(String filename)
```

The `readFile` method should:
- return a `List<String>` object, where each list item is a line from the specified file

## :pushpin: File Writing

Add the following method to the `FileManager` class:

```java
public void copy(String inputFile, String outputFile)
```

The `copy` method should:
- copy the contents of a text file at the path defined by `inputFile` to the path defined by `outputFile`.
- create `outputFile` if it doesn't exist and overwrite it, if it does

### :bookmark: Note:
The paths to `inputFile` and `outputFile` are relative to the root directory of this repository (e.g. `exercises/input-output/src/main/resources/exercise.txt`)

## :pushpin: `java.nio.*`

Improve the `FileManager` class by using the `java.nio.*` classes to replace the logic of the `readFile` and `copy` methods.

## :pushpin: File Content Handling

Add the following method to the `FileManager` class:

```java
public void reverseLines(String inputFile, String outputFile)
```

The `reverseLines` method should:
- read the contents of `inputFile`
- write the lines to `outputFile`, but in reverse order; the first line will be the last one, the second will be the penultimate, and so on, until the last line of the original file, which should appear in the first position of the resulting file.
- create `outputFile` if it doesn't exist and overwrite it, if it does
- look in this project's resources folder for both `inputFile` and `outputFile`
- not reuse any of the previous methods

Create a program to "invert" the contents of a text file.
We've provided the input `exercise.txt` file in this project's resources folder.

Write code that reads the content of the `exercise.txt`, then writes them to an `inverted.txt` file. 

It should contain the same lines as the original but in reverse order:
- the first line will be the last one, 
- the second will be the penultimate, and so on, until the last line of the original file, which should appear in the first position of the resulting file.

## :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the provided unit tests.

In your terminal, ensure that you are in the `input-output` folder. Then run the following command in your terminal:

```shell
./mvnw clean test
```

If you are on Windows, run this command instead:

```shell
mvnw.cmd clean test
```

### Tests Results

Your implementation is correct when all tests pass:

```shell
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] ├─ App Test Suite - 0.018s
[INFO] │  └─ ✔ creates the app - 0.01s
[INFO] ├─ FileManager Test Suite - 0.035s
[INFO] │  ├─ ✔ copy() method copies file content to new file correctly - 0.009s
[INFO] │  ├─ ✔ copy() method overwrites existing file - 0.001s
[INFO] │  ├─ ✔ reverseLines() method copies empty content to new file correctly - 0.002s
[INFO] │  ├─ ✔ getReader() method throws IOException for non-existent file - 0.002s
[INFO] │  ├─ ✔ getReader() method can read file contents - 0.001s
[INFO] │  └─ ✔ reverseLines() method copies reversed content to new file correctly - 0.002s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.192 s
[INFO] Finished at: 2023-09-07T15:27:50+01:00
[INFO] ------------------------------------------------------------------------

```
## Class usage
Once you've verified your class works correctly, you can utilise it in `App.java`.

Add the following methods and call them from the `main` method:

```java
public static void readFile(String filePath) {}

public static void reverseFile(String sourcePath, String targetPath) {}
```

The `readFile` method should:
- use a `FileManager` instance to read the contents of the sample file we've provided at `resources/exercise.txt` file
- print the contents to the screen, line by line

The `reverseFile` method should:
- use a `FileManager` instance to reverse the contents of the sample file we've provided at `resources/exercise.txt` file to a new file at `resources/reversed.txt`
- read the contents of the reversed file
- print the contents to the screen, line by line

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/