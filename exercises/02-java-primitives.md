# Working With Primitives

[![Java Language](https://img.shields.io/badge/platform-OpenJDK-3A75B0.svg?logo=OpenJDK)][1]

The goal of this exercise is to familiarise ourselves with Java:
- primitive types
- and legal and illegal operations on primitive types

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

Why is that?

## :pushpin: Java `String`

Using the [String Java documentation][2] as a guide, write code for the instructions marked with a `//TODO` comment:

**Exercise 1**

```java
public class Strings {
    public static void main(String... args) {
        char[] characters = {'h', 'e', 'l', 'l', 'o'};

        //TODO: create a String from the above array of characters and print it
    }
}
```

**Exercise 2**

```java
public class Strings {
    public static void main(String... args) {
        String java = 
            "Java is a programming language and computing platform first released by Sun Microsystems in 1995. " +
            "It has evolved from humble beginnings to power a large share of today’s digital world, by providing " + 
            "the reliable platform upon which many services and applications are built.";

        //TODO: how many 'e' characters are in the string above
        //  add your code here

        //TODO: how many characters does the string contain  
        //  add your code here
    }
}
```

**Exercise 3**

Write code which checks if a word is a **palindrome**.

A palindrome is a word which you can read from both sides (from left to right or from right to left) and you will get the same word.

**Examples** <br/>
- anna 
- radar
- solos

```java
import java.util.List;

public class Palindrome {
    public static void main(String... args) {
        List<String> words = List.of(
                "typescript", "refer", "javascript", "radar", "java", "python",
                "noon", "midnight", "madam", "java", "python", "street", "apple"
        );

        //TODO: for each word in the list, determine whether it is a palindrome
        //  add your code here

    }
}
```

[1]: https://docs.oracle.com/javase/8/docs/api/index.html
[2]: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html