# Working With Primitives

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of this exercise is to familiarise ourselves with:
- [Primitive types][7]
- [Legal and illegal operations on primitive types][8]
- [String operations in Java][9]

## :walking: Decimal Types

### Arithmetic Operations

Following our example of arithmetic operations on integers, create a simple Java program with simple expressions to (for both `float` and `double` types):

- add decimal numbers
- subtract decimal numbers
- multiply decimal numbers
- divide decimal numbers

and print the results on the screen.

### Relational Operations

Following our example of relational operations on integers, create a simple Java program with simple expressions to (for `double`s only):

- compare the equality of decimal numbers
- evaluate which decimal is higher
- evaluate which decimal is smaller

and print the results on the screen.


## :running: Unary Operators - Increment & Decrement

What do the following expressions evaluate to:

```java
int number1 = 12;
int number2 = 12;

System.out.println(number1++);
System.out.println(++number2);
```

**Why is that?**


## :thread: String Operations in Java

For this section, we've provided the starter project above. It contains:

- the [StringExercises class][4] with three methods to implement: `concatenate`, `areEqual` and `format`

- and a test suite to verify your implementation [StringExercisesTest][5].

Using the [String Java documentation][6] as a guide, implement the methods of the `StringExercises` class.

In each method, replace the `throw new RuntimeException("Not implemented")` with your code.

<br/>

**<ins>Exercise 1</ins>**

Implement the `concatenate` method in such a way that it creates a new String by concatenating the provided parameters.

```java
public String concatenate(String word1, String word2, String word3) {
    // TODO: Write code that concatenates the input parameters and returns the result
    throw new RuntimeException("Not implemented");
}
```

<br/>

**<ins>Exercise 2</ins>**

Implement the `areEqual` method, which determines whether the two provided parameters are equal strings. The equality check should be case-sensitive (i.e. hello != HELLO)

```java
public Boolean areEqual(String word1, String word2) {
    // TODO: Write code to determine whether the input parameters are equal strings
    throw new RuntimeException("Not implemented");
}
```

<br/>

**<ins>Exercise 3</ins>**

Implement the `format` method, which returns a formatted string containing the provided parameters. The price value should be displayed with a pound (£) symbol and two decimal places.

**Example**
```java
String lineItem = new StringExercises().format("Apple iPhone 15 Pro", 47, 1199.99);

System.out.println(lineItem); // Output: Item: Apple iPhone 15 Pro. Price: £1199.99. Quantity: 47
```

```java
public String format(String item, int quantity, double price) {
    // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]"
    throw new RuntimeException("Not implemented");
}
```

## :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `StringExercisesTest` tests.

In your terminal, ensure that you are in the `java-primitives` folder.
Then run the following command in your terminal.

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
[INFO] ├─ String Exercises - 0.072s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[1] Java, Java, true - 0.018s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[2] HTML, HTML, true - 0.001s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[3] beta, beta, true - 0.001s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[4] camel-case, camel_case, false - 0.001s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[5] WET, wet, false - 0.001s
[INFO] │  ├─ ✔ areEqual() method returns equality of two strings[6] dry, DRY, false - 0s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[1] Red, Green, Blue, RedGreenBlue - 0.005s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[2] one, two, three, onetwothree - 0s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[3] QUICK, BROWN, FOX, QUICKBROWNFOX - 0s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[4] www., google., com, www.google.com - 0s
[INFO] │  ├─ ✔ concatenate() method returns correctly concatenated string[5] Intro , to , Java, Intro to Java - 0s
[INFO] │  ├─ ✔ format() method returns formatted string[1] Laptop, 27, 1999.99 - 0.008s
[INFO] │  ├─ ✔ format() method returns formatted string[2] Mobile phone, 200, 999.99 - 0.001s
[INFO] │  ├─ ✔ format() method returns formatted string[3] Tablet, 85, 1199.99 - 0s
[INFO] │  ├─ ✔ format() method returns formatted string[4] Charger, 467, 29.99 - 0s
[INFO] │  └─ ✔ format() method returns formatted string[5] USB cable, 883, 8.99 - 0s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 16, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.098 s
[INFO] Finished at: 2023-10-26T02:34:16+01:00
[INFO] ------------------------------------------------------------------------
```

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/
[4]: https://github.com/cbfacademy/intro-to-java-course/blob/main/exercises/java-primitives/src/main/java/com/cbfacademy/StringExercises.java
[5]: https://github.com/cbfacademy/intro-to-java-course/blob/main/exercises/java-primitives/src/test/java/com/cbfacademy/StringExercisesTest.java
[6]: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
[7]: #walking-decimal-types
[8]: #running-unary-operators---increment--decrement
[9]: #thread-string-operations-in-java
