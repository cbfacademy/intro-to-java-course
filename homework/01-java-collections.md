# Working With Java Collections

[![Java Language](https://img.shields.io/badge/platform-OpenJDK-3A75B0.svg?logo=OpenJDK)][1]

The goal of these programming exercises is to practise working with:
- Strings
- the [Java Collections Framework][2]
- and learn to distinguish working with interfaces and actual implementations


## :pushpin: Java Streams

Write a program that prints its arguments in random order.
- Do not make a copy of the argument array. 
- Demonstrate how to print out the elements using both **streams** and the traditional **enhanced for** statement.

## :pushpin: Java Sets

Modify the `FindDups` example below to use a `SortedSet` instead of a `Set`. 

Specify a `Comparator` so that case (upper or lowercase) is ignored when sorting and identifying set elements.


```java
import java.util.*;

public class FindDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args) {
            s.add(a);
        }

        System.out.println(s.size() + " distinct words: " + s);
    }
}
```

## :pushpin: Java Strings

Write a method that takes a `List<String>` and trims each element of the list.


## :pushpin: Java Interfaces

Consider the four core interfaces, `Set`, `List`, `Queue`, and `Map`. 

For each of the following four assignments, **specify which of the four core interfaces is best-suited**, and **explain how to use it to implement the assignment**.

1. Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month, an employee will be chosen at random from these records to receive a free toy.

2. WTI has decided that each new product will be named after an employee but only first names will be used, and each name will be used only once. Prepare a list of unique first names.

3. WTI decides that it only wants to use the most popular names for its toys. Count up the number of employees who have each first name.

4. WTI acquires season tickets for the local lacrosse team, to be shared by employees. Create a waiting list for this popular sport.


[1]: https://docs.oracle.com/javase/8/docs/api/index.html 
[2]: https://docs.oracle.com/javase/tutorial/collections/intro/index.html 