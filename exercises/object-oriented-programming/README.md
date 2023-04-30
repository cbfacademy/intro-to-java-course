# Object-Oriented Programming

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these exercises is to practise OOP concepts:
- Encapsulation
- Inheritance
- Polymorphism

For the exercises below, we've provided the starter project above.

## :pushpin: Immutability

Inside the `people` package, create a class called `ImmutablePerson` with the following characteristics:
- a required first name
- an optional middle name
- a required last name
- an optional list of nicknames

## :pushpin: Inheritance

**<ins>Part 1</ins>**

Inside the `accounts` package, create a class called `Account` with the following characteristics:
- an instance variable `balance` to hold the account balance
- and instance variable `accountNumber` to hold the account number

The `Account` class allows deposits and withdraws, but not overdraft limits or interest rates.

**Note that the balance of an account may only be modified through the `deposit` and `withdraw` methods.**

**<ins>Part 2</ins>**

Using the `Account` class as a base class, create two derived classes `SavingsAccount` and `CurrentAccount`.

- A `SavingsAccount` object, in addition to the attributes of an `Account` object, should have an interest variable and a method which adds interest to the account.
- A `CurrentAccount` object, in addition to the attributes of an `Account` object, should have an overdraft limit variable.

- Ensure that you have overridden methods of the Account class as necessary in both derived classes.

**<ins>Part 3</ins>**

Now create a `Bank` class, an object which contains a list of `Account` objects. Accounts in the list could be instances of the `Account` class, the `SavingsAccount` class, or the `CurrentAccount` class.

Write an `update` method in the bank class. It iterates through each account, updating it in the following ways: 
- saving accounts get interest added (via the method you already wrote); 
- current accounts get a letter sent if they are in overdraft.

Additionally, the `Bank` class requires methods for opening and closing accounts, and for paying a dividend into each account.

## :pushpin: Abstraction

In this exercise you will develop a class hierarchy of shapes and write a program that computes the amount of paint
needed to paint different objects. 
The hierarchy will consist of a parent class `Shape` with three derived classes - `Sphere`, `Rectangle`, and `Cylinder`. 
For the purposes of this exercise, the only attribute a shape will have is a `name` and the method of
interest will be one that computes the area of the shape (surface area in the case of three-dimensional shapes).

**<ins>Part 1</ins>**

Inside the `shapes` package, create an abstract class `Shape` with the following properties:
- an instance variable `shapeName` of type String
- an abstract method `area()`
- a `toString` method that returns the name of the shape

In the same package, create a concrete class `Sphere`:
- it is a descendant of `Shape`
- it has a radius `radius`, and its area (surface area) is given by the formula (`4` * `𝛑` * (`radius`<sup>2</sup>)).

In the same package, create a concrete class `Rectangle`:
- it is a descendant of `Shape`
- it is defined by a `length` and a `width`, and its area is given by the formula (`length` * `width`).

In the same package, create a concrete class `Cylinder`:
- it is a descendant of `Shape`
- it is defined by a radius `radius` and a `height`, and its area (surface area) is given by the formula (`height` * `𝛑` * (`radius`<sup>2</sup>)).

**<ins>Part 2</ins>**

Inside the `shapes` package, create a class `Paint` with the following properties:
- an instance variable `coverage` of type Double, which represents the number of square feet per gallon of paint
- a method `amount(Shape shape)` which returns the amount of paint (number of gallons) needed to paint a given shape

In the same package, create a **program** `PaintShapes` that computes the amount of paint needed to paint various shapes:
- a rectangle deck of length `35` and width `20` 
- a ball of radius `15`
- and a tank of radius `10` and height `30`.

Run the program, and print the overall amount of paint needed to the screen.

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/