# Exception Handling

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of this exercise is to practise:
- Creating custom exceptions
- Handling exceptions

For the exercises below, we've provided the starter project above.

## :pushpin: Exceptions

### Question 1

Is the following code legal?

```java
try {

} finally {

}
```

### Question 2

What exception types can be caught by the following handler?
```java
catch (Exception e) {
    
}
```

What is wrong with using this type of exception handler?

### Question 3

Is there anything wrong with the following exception handler as written? Will this code compile?

```java
try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}
```

### Question 4

```java
int[] A; 
A[0] = 0;
```

The above code produces (choose 1):

- [ ] an error
- [ ] a checked exception
- [ ] an unchecked exception
- [ ] a compile error
- [ ] no exception

### Question 5

The JVM starts running your program, but the JVM can't find the Java platform classes. 
(The Java platform classes reside in classes.zip or rt.jar.)

What happens (choose 1):

- [ ] an error
- [ ] a checked exception
- [ ] an unchecked exception
- [ ] a compile error
- [ ] no exception

## :pushpin: Custom Exceptions

Create a custom (checked) exception class called `FilenameException`.

Create a class called `FileExtension` with the following methods:

- `boolean check(String filename)`
- `Map<String, int> map(List<String> filenames)`

The `check` method should:
- return `true` when the file extension is `.java`
- return `false` when the file extension is not `.java`
- throw a custom checked exception called `FilenameException` (that you must create) when the file name is `null` or an empty string.

The `map` method should:
- check each provided file's extension and map the returned value as 1 if true or 0 if false
- map `-1` when an exception occurs

**Example**

For the following list of file names: `Arrays.asList("App.java", "App.txt", null, "App.md")`, the `map` method should return a map with the following entries:

```txt
{"App.java", 1},
{"App.txt", 0},
{null, -1},
{"App.md", 0}
```

[1]: https://docs.oracle.com/javase/17/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/