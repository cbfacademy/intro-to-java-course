# Flow Control

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]

The goal of these exercises is to practise:
- conditional evaluation in Java programs
- use loops to operate on collections we saw earlier in the course

## :printer: FizzBuzz

Write a Java program that:
- creates and initialises a list of 100 numbers - from 1 to 100
- for each element of the list:
    - prints “Fizz” if the element is divisible by 3
    - prints “Buzz” if the element is divisible by 5
    - prints “FizzBuzz” if the element is divisible by both 3 and 5

**Hint** <br/>
The `modulo` operator will come in handy in determining
whether a number is divisible by another.

```java
public class FizzBuzz {
    public static void main(String... args) {
        //TODO: create a List of numbers from 1 to 100
        
        //TODO: loop through the list and
        //  prints “Fizz” if the element is divisible by 3
        //  prints “Buzz” if the element is divisible by 5
        //  prints “FizzBuzz” if the element is divisible by both 3 and 5

    }
}

```

## :date: Weeks and Days

- Use a for loop (outer) to print headings for four weeks (Weeks 1 - 4).
- Then use another for loop (inner) to print the days (Days 1 -7) for each week.

The output will look similar to this

```java
Week 1
    Day 1
    Day 2
    Day 3
    Day 4
    Day 5
    Day 6
    Day 7
Week 2
    Day 1
    Day 2
    Day 3
    Day 4
    Day 5
    Day 6
    Day 7
...
```

## :coffee: Collections

Write a Java program that:
- creates and initialises a list of 100 numbers - from 1 to 100
- determines the sum of all the even numbers in the list
- determines the sum of all the odd numbers in the list


```java
public class Numbers {
    public static void main(String... args) {
        //TODO: create a List of numbers from 1 to 100
        
        //TODO: calculate the sum of all even numbers in the list
        
        //TODO: calculate the sum of all odd numbers in the list

    }
}

```

----

Write a Java program that:
- creates and initialises a list of 100 numbers - from 1 to 100
- sorts the list in reverse order

**Hint** <br/>
Use the `java.util.Collections` [class documentation][2].



```java
public class ReverseOrder {
    public static void main(String... args) {
        //TODO: create a List of numbers from 1 to 100
        
        //TODO: sort the list in reverse order


    }
}

```

[1]: https://docs.oracle.com/javase/8/docs/api/index.html
[2]: https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html 