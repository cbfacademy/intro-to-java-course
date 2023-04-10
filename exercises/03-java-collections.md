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
        // add your code here

        //TODO: add 5, 6, 8, 2, 9 to the the list
        // add your code here

        //TODO: add another 2 as the last element of the list
        // add your code here

        //TODO: print the list to the screen
        // add your code here

        //TODO: access the 3rd element of the list, and print it on the screen
        // add your code here

        //TODO: what does invoking the method element() on the list return?
        // add your code here

    }
}
```

## :pushpin: Java `Stack`

Using the [Stack Java documentation][4] as a guide, write code for the instructions marked with a `//TODO` comment:

```java
import java.util.*;

public class WorkingWithStacks {
    public static void main(String... args) {

        // create an empty stack
        Stack<Integer> integers = new Stack<>();

        //TODO: add 5, 6, 8, 9 to the the stack.
        // add your code here

        //TODO: print the first and the last element of the stack?
        // add your code here

        //TODO: print the element returned by invoking the pop() method on the stack?
        // add your code here

        //TODO: what does the stack look like now? Print it on the screen.
        // add your code here

        //TODO: invoke the push(4) method on the stack, then print the stack on the screen.
        // add your code here

    }
}
```

## :pushpin: Java `Queue`

Using the [ArrayDeque Java documentation][5] as a guide, write code for the instructions marked with a `//TODO` comment:

```java
import java.util.*;

public class WorkingWithQueues {
    public static void main(String... args) {

        // create an empty queue
        ArrayDeque<Integer> integers = new ArrayDeque<>();

        //TODO: add 5, 6, 8, 9 to the the queue
        // add your code here

        //TODO: print the first and the last element of the queue
        // add your code here

        //TODO: print the element returned by invoking the poll() method on the queue?
        // add your code here

        //TODO: what does the queue look like now? Print it on the screen.
        // add your code here

        //TODO: print the result of invoking the element() method on the queue, then print the queue on the screen.
        // add your code here

    }
}
```

## :pushpin: Java `HashMap`

Using the [HashMap Java documentation][6] as a guide, write code for the instructions marked with a `//TODO` comment:

```java
import java.util.*;

public class WorkingWithMaps {
    public static void main(String... args) {
        // create an empty map
        HashMap<Integer, String> languages = new HashMap<>();

        // add entries to the map
        languages.put(1, "TypeScript");
        languages.put(2, "Kotlin");
        languages.put(3, "Python");
        languages.put(4, "Java");
        languages.put(5, "JavaScript");
        languages.put(6, "Rust");

        //TODO: determine the set of keys from the map and print it on the screen
        // add your code here

        //TODO: determine the set of values from the map and print it on the screen
        // add your code here

        //TODO: determine whether the map contains "English" as a language
        // add your code here
    }
}
```


[1]: https://docs.oracle.com/javase/8/docs/api/index.html 
[2]: https://docs.oracle.com/javase/tutorial/collections/intro/index.html 
[3]: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
[4]: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
[5]: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
[6]: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html 