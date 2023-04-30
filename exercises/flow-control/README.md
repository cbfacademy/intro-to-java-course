# Flow Control

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][3]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][4]

The goal of these exercises is to practise:
- conditional evaluation in Java programs
- use loops to operate on collections we saw earlier in the course

We've provided the starter project above. It contains:

- the [FlowControlExercises class][5] with four methods to implement: `fizzBuzz`, `weeksAndDays`, and `oddAndEvenNumbers`

- and a test suite to verify your implementation [FlowControlExercisesTest][6].

In each method, replace the `throw new RuntimeException("Not implemented")` with your code.

## :bee: FizzBuzz

Implement the `fizzBuzz` method as described below.

```java
public List<String> fizzBuzz(List<Integer> numbers) {
    // TODO - Implement this method such that 
    //  it creates a list where for each element of the input list ${numbers}
    //  - if the ${element} is divisible by 3, it adds “Fizz” to the list 
    //  - if the ${element} is divisible by 5, it adds “Buzz” to the list 
    //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list 
    //  - it adds the element to the list in any other case 
    //  - it returns the constructed list
    throw new RuntimeException("Not implemented");
}
```

**<ins>Hint</ins>** <br/>

The `modulo` operator will come in handy in determining whether a number is divisible by another.

## :date: Months

Implement the `whichMonth` method as described below.

```java
public String whichMonth(Integer number) {
    // TODO - Implement this method such that
    //  - it returns the month corresponding to the input ${number}
    //  - if the ${number} is invalid, the method should return "Invalid month number"
    throw new RuntimeException("Not implemented");
}
```

## :100: Collections and Numbers

**<ins>Exercise 1</ins>**

Implement the `sumOfOddsAndSumOfEvens` method as described below.

```java
public Map<String, Integer> sumOfOddsAndSumOfEvens() {
    // TODO - Implement this method such that
    //  - creates and initialises a list of 100 numbers - from 1 to 100
    //  - determines the sum of all the even numbers in the list
    //  - determines the sum of all the odd numbers in the list
    //  - returns a map with two entries:
    //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
    throw new RuntimeException("Not implemented");
}
```

**<ins>Exercise 2</ins>**

Implement the `reverse` method as described below.

**Hint** <br/>

Use the `java.util.Collections` [class documentation][2].

```java
public List<Integer> reverse(ArrayList<Integer> numbers) {
    // TODO - Implement this method such that
    //  - it takes an array list of integers
    //  - it returns the list in reverse order
    throw new RuntimeException("Not implemented");
}
```

## :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `FlowControlExercisesTest` tests.

In your terminal, ensure that you are in the `flow-control` folder.
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
[INFO] ├─ Flow Control Exercises - 0.073s
[INFO] │  ├─ ✔ returns this unit's name - 0.011s
[INFO] │  ├─ ✔ Months[1] 17, Invalid month number - 0.017s
[INFO] │  ├─ ✔ Months[2] 0, Invalid month number - 0.001s
[INFO] │  ├─ ✔ Months[3] 4, April - 0.001s
[INFO] │  ├─ ✔ Months[4] 1, January - 0s
[INFO] │  ├─ ✔ Odd and Even Numbers - 0.001s
[INFO] │  ├─ ✔ Fizz Buzz[1] [1, 2, 4, 7, 8, 11, 13, 17], [1, 2, 4, 7, 8, 11, 13, 17] - 0s
[INFO] │  ├─ ✔ Fizz Buzz[2] [1, 2, 3, 5, 9, 15, 21, 30, 35], [1, 2, Fizz, Buzz, Fizz, FizzBuzz, Fizz, FizzBuzz, Buzz] - 0s
[INFO] │  ├─ ✔ Fizz Buzz[3] [3, 5, 15, 18, 20, 30], [Fizz, Buzz, FizzBuzz, Fizz, Buzz, FizzBuzz] - 0.001s
[INFO] │  ├─ ✔ Fizz Buzz[4] [213, 54, 91, 187, 2001, 2023], [Fizz, Fizz, 91, 187, Fizz, 2023] - 0s
[INFO] │  ├─ ✔ Reverse the list order[1] [1, 2, 4, 7, 8, 11, 13, 17], [17, 13, 11, 8, 7, 4, 2, 1] - 0s
[INFO] │  ├─ ✔ Reverse the list order[2] [1, 2, 3, 5, 9, 15, 21, 30, 35], [35, 30, 21, 15, 9, 5, 3, 2, 1] - 0s
[INFO] │  ├─ ✔ Reverse the list order[3] [123, -5, 0, 1890, 20, 30], [30, 20, 1890, 0, -5, 123] - 0s
[INFO] │  └─ ✔ Reverse the list order[4] [213, 54, 91, 187, 2001, 2023], [2023, 2001, 187, 91, 54, 213] - 0.001s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.371 s
[INFO] Finished at: 2023-04-30T00:22:52+01:00
[INFO] ------------------------------------------------------------------------

```

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
[3]: https://junit.org/junit5/
[4]: https://maven.apache.org/
[5]: https://github.com/cbfacademy/intro-to-java-course/blob/main/exercises/flow-control/src/main/java/com/cbfacademy/FlowControlExercises.java
[6]: https://github.com/cbfacademy/intro-to-java-course/blob/main/exercises/flow-control/src/test/java/com/cbfacademy/FlowControlExercisesTest.java