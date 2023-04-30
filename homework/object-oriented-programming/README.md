# Object-Oriented Programming

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of this programming assignment is to practise OOP concepts:
- Encapsulation
- Inheritance
- Polymorphism

For the assignment below, we've provided the starter project above.

## :coffee: Interfaces

**<ins>Exercise 1</ins>**

What methods would a class that implements the `java.lang.CharSequence` interface have to implement?

Inside the `words` package, create a class `ReverseCharSequence` that implements the `CharSequence` interface found in the `java.lang` package. 
Your implementation should return the string backwards. 

**<ins>Exercise 2</ins>**

Inside the `shapes` package, create an interface `Enclosure` with two methods:
- `perimeter()`, which returns the perimeter of a given geometrical shape
- `area()`, which returns the surface area of a given geometrical shape

In the same package, create a `Circle` class:
- with a `radius` attribute
- and it implements the `Enclosure` interface

In the same package, create a `Square` class:
- with a `width` attribute
- and it implements the `Enclosure` interface

In the same package, create a **program** `Shapes` that computes the perimeter and area of various shapes:
- it should have a `computeArea` method that takes a list of `Enclosure` objects and computes the sum of their areas
- it should have a `computePerimeter` method that takes a list of `Enclosure` objects and computes the sum of their perimeters

What should the computed area and the computed perimeter be for all these shapes?
- a square deck of width `20`
- a square deck of width `4`
- a square deck of width `12`
- a circle of radius `15`
- a circle of radius `10`
- a circle of radius `5`

Run the program, and print the results to the screen.


[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/