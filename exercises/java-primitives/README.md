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

- the [StringExercises class][4] with three methods to implement: `fromCharacters`, `howMany` and `isPalindrome`

- and a test suite to verify your implementation [StringExercisesTest][5].

Using the [String Java documentation][6] as a guide, implement the methods of the `StringExercises` class.

In each method, replace the `throw new RuntimeException("Not implemented")` with your code.

<br/>

**<ins>Exercise 1</ins>**

Implement the `fromCharacters` method in such a way that it creates a String from the input array of characters.

```java
public String fromCharacters(char[] characters) {
    // TODO: Write code that creates a String from the input array of characters
    throw new RuntimeException("Not implemented");
}
```

<br/>

**<ins>Exercise 2</ins>**

Implement the `howMany` method, which determines the number of times an input character is found in the input text.

```java
public Long howMany(String text, Character character) {
    // TODO: Write code to determine how many of the input ${character} are contained in the input ${text}
    throw new RuntimeException("Not implemented");
}
```

<br/>

**<ins>Exercise 3</ins>**

Implement the `isPalindrome` method, which checks if a word is a **palindrome**.

A palindrome is a word which read from both sides (from left to right or from right to left) results to the same word.

**Examples** <br/>
- anna
- radar
- solos

```java
public Boolean isPalindrome(String word) {
    // TODO: Write code to determine whether the input ${word} is a palindrome
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
[INFO] ├─ String Exercises - 0.079s
[INFO] │  ├─ ✔ returns this unit's exercises name - 0.012s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[1] anna, true - 0.019s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[2] radar, true - 0.001s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[3] refer, true - 0.001s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[4] solos, true - 0.001s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[5] noon, true - 0.001s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[6] madam, true - 0s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[7] typescript, false - 0.001s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[8] javascript, false - 0.001s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[9] java, false - 0s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[10] street, false - 0s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[11] apple, false - 0s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[12] python, false - 0.001s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[13] midnight, false - 0.001s
[INFO] │  ├─ ✔ returns a String from an array of characters[1] [h, e, l, l, o], hello - 0.001s
[INFO] │  ├─ ✔ returns a String from an array of characters[2] [w, o, r, l, d], world - 0.001s
[INFO] │  ├─ ✔ returns a String from an array of characters[3] [C, B, F], CBF - 0.001s
[INFO] │  ├─ ✔ returns a String from an array of characters[4] [a, c, a, d, e, m, y], academy - 0s
[INFO] │  ├─ ✔ returns a String from an array of characters[5] [i, n, t, r, o, -, t, o, -, j, a, v, a], intro-to-java - 0s
[INFO] │  ├─ ✔ counts the number of times a character is found in a string[1] This section describes the Java Collections Framework. Here, you will learn what collections are and how they can ... - 0.001s
[INFO] │  └─ ✔ counts the number of times a character is found in a string[2] Java is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved f... - 0s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 21, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.319 s
[INFO] Finished at: 2023-04-29T16:49:21+01:00
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
