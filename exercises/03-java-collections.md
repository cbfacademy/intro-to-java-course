# Working With Java Collections

[![Java Language](https://img.shields.io/badge/platform-OpenJDK-3A75B0.svg?logo=OpenJDK)][1]

The goal of these exercises is to familiarise ourselves with:
- the [Java Collections Framework][2]
- and learn to distinguish working with interfaces and actual implementations

## :pushpin: Java `LinkedList`

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

Using the [LinkedList Java documentation][3] as a guide, write code for the instructions marked with a `//TODO` comment:

```java
import java.util.*;

public class WorkingWithLists {
    public static void main(String... args) {

        // create an empty list
        LinkedList<Integer> integers = new LinkedList<>();

        //TODO: add 4 as the first element of the list
        // your code here

        //TODO: add 5, 6, 8, 2, 9 to the the list
        // your code here

        //TODO: add another 2 as the last element of the list
        // your code here

        //TODO: print the list to the screen
        // your code here

        //TODO: access the 3rd element of the list, and print it on the screen
        // your code here

        //TODO: what does invoking the method element() on the list return?

    }
}
```

## :pushpin: Java `Stack`

Using the [Stack Java documentation][4] as a guide, write code for the instructions marked with a `//TODO` comment:

```java
import java.util.*;

public class WorkingWithLists {
    public static void main(String... args) {

        // create an empty stack
        Stack<Integer> integers = new Stack<>();

        //TODO: add 5, 6, 8, 9 to the the stack

        //TODO: print the first and the last element of the stack?

        //TODO: print the element returned by invoking the pop() method on the stack?

        //TODO: what does the stack look now? Print it on the screen

        //TODO: invoking the push(4) method on the stack, then print the stack on the screen.

    }
}
```


## :pushpin: Java Sets

## :pushpin: Java Queues

## :pushpin: Java Maps

## :pushpin: Java Iterators


[1]: https://docs.oracle.com/javase/8/docs/api/index.html 
[2]: https://docs.oracle.com/javase/tutorial/collections/intro/index.html 
[3]: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
[4]: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html