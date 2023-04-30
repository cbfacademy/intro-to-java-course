# Working With Java Collections

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][7]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][8]

The goal of these exercises is to familiarise ourselves with:
- the [Java Collections Framework][2]
- and learn to distinguish working with interfaces and actual implementations.

We've provided the starter project above. It contains:

- the [CollectionsExercises class][9] with four methods to implement: `useLinkedList`, `useStack`, `useArrayDeque` and `useHashMap`

- and a test suite to verify your implementation [CollectionsExercisesTest][10].

In each method, replace the `throw new RuntimeException("Not implemented")` with your code.

**<ins>Hint</ins>**

When printing on the screen, use the method that does not introduce line breaks.

----

## :books: Java `LinkedList`

In our earlier examples on lists, we gave our list a `List` (of `Integer`) type:

```java
List<Integer> integers = new LinkedList<>();
```

We can also declare our list as a `LinkedList` - which means that:
- our `integers` list is of type `List`,
- and it is a `LinkedList` specifically.


```java
LinkedList<Integer> integers = new LinkedList<>();
```

This allows us to access functionality that is specific to `LinkedList`, and may not be available on the `List` type.

----

Using the [LinkedList Java documentation][3] as a guide, implement the `useLinkedList` method as described below.

```java
public LinkedList<Integer> useLinkedList() {
    // TODO: create an empty linked list
    //  - add 4 as the first element of the list
    //  - then add 5, 6, 8, 2, 9 to the the list
    //  - add another 2 as the last element of the list
    //  - add 4 as the 3rd element of the list
    //  - invoke the method element() on the list and print the result on the screen
    //  - return the list
    throw new RuntimeException("Not implemented");
}
```

## :books: Java `Stack`

Using the [Stack Java documentation][4] as a guide, implement the `useStack` method as described below.

```java
public Stack<Integer> useStack() {
    // TODO: create an empty stack
    //  - add 5, 6, 8, 9 to the the stack
    //  - print the first element of the stack on the screen
    //  - print the last element of the stack on the screen
    //  - invoke the method pop() on the stack and print the result on the screen
    //  - invoke the push(4) method on the stack
    //  - return the stack
    throw new RuntimeException("Not implemented");
}
```

## :books: Java `ArrayDeque`

Using the [ArrayDeque Java documentation][5] as a guide, implement the `useArrayDeque` method as described below.

```java
public ArrayDeque<Integer> useArrayDeque() {
    // TODO: create an empty arrayDeque
    //  - add 5, 6, 8, 9 to the the stack
    //  - print the first element of the queue on the screen
    //  - print the last element of the queue on the screen
    //  - invoke the method poll() on the queue and print the result on the screen
    //  - invoke the element() method on the queue and print the result on the screen
    //  - return the queue
    throw new RuntimeException("Not implemented");
}
```

## :books: Java `HashMap`

Using the [HashMap Java documentation][6] as a guide, implement the `useHashMap` method as described below.

```java
public HashMap<Integer, String> useHashMap() {
    // TODO: create an empty hash map
    //  - add {1, TypeScript} entry to the map
    //  - add {2, Kotlin} entry to the map
    //  - add {3, Python} entry to the map
    //  - add {4, Java} entry to the map
    //  - add {5, JavaScript} entry to the map
    //  - add {6, Rust} entry to the map
    //  - determine the set of keys from the map and print it on the screen
    //  - determine the set of keys from the map and print it on the screen
    //  - determine whether the map contains "English" as a language and print the result on the screen
    //  - return the map
    throw new RuntimeException("Not implemented");
}
```

## :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `CollectionsExercisesTest` tests.

In your terminal, ensure that you are in the `java-collections` folder.
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
[INFO] ├─ Collections Exercises - 0.027s
[INFO] │  ├─ ✔ working with HashMaps - 0.013s
[INFO] │  ├─ ✔ returns this unit's name - 0.001s
[INFO] │  ├─ ✔ working with ArrayDeques - 0.001s
[INFO] │  ├─ ✔ working with Stacks - 0s
[INFO] │  └─ ✔ working with LinkedLists - 0s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.274 s
[INFO] Finished at: 2023-04-29T22:05:04+01:00
[INFO] ------------------------------------------------------------------------
```

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://docs.oracle.com/javase/tutorial/collections/intro/index.html
[3]: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
[4]: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
[5]: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
[6]: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
[7]: https://junit.org/junit5/
[8]: https://maven.apache.org/
[9]: https://github.com/cbfacademy/intro-to-java-course/blob/main/exercises/java-collections/src/main/java/com/cbfacademy/CollectionsExercises.java
[10]: https://github.com/cbfacademy/intro-to-java-course/blob/main/exercises/java-collections/src/test/java/com/cbfacademy/CollectionsExercisesTest.java