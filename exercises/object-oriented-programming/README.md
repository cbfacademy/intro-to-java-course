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


[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/