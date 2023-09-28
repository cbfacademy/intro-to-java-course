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

### Part 1

Inside the `accounts` package, create a class called `Account` with the following members:
- `Account(int accountNumber, double balance)` - constructor
- `double balance` - instance variable
- `int accountNumber` - instance variable
- `double getBalance()` - returns the current account balance
- `int getAccountNumber()` - returns the account number
- `double deposit(double amount)` - deposits funds to the account and returns the new balance
- `double withdraw(double requested)` - withdraws funds from the account and returns the requested amount or `0` if the account has an insufficient balance

#### Notes
- This account doesn't have an overdraft facility.
- The balance of an account may only be modified through the `deposit()` and `withdraw()` methods.
- Consider the appropriate visibility of the instance variables to allow any sub-classes to access those values

### Part 2

Using the `Account` class as a base class, create two derived classes:

`SavingsAccount` with the following members, in addition to the attributes of the `Account` class:
- `SavingsAccount(int accountNumber, double balance, double interestRate)` - constructor
- `double interestRate` - instance variable
- `void applyInterest()` applies interest to the account
- `double getInterestRate()` - returns the current interest rate
- `void setInterestRate()` - sets the interest rate

`CurrentAccount` with the following members, in addition to the attributes of the `Account` class:
- `CurrentAccount(int accountNumber, double balance, double overdraftLimit)` - constructor
- `double overdraftLimit` - instance variable
- `double getOverdraftLimit()` - returns the current overdraft limit
- `void setOverdraftLimit()` - sets the overdraft limit

#### Notes
Ensure that you have overridden methods of the `Account` class where necessary in the derived classes.

### Part 3

Create a `Bank` class, with the following members:
- `List<Account> accounts` - instance variable. Remember that accounts in the list could be instances of the `Account` class, the `SavingsAccount` class, or the `CurrentAccount` class.
- `void closeAccount(int accountNumber)` - removes the specified account from the bank's list
- `void contactAccountHolder(int accountNumber, String message)` - displays a message that would be sent to the holder of the specified account
- `Account getAccount(int accountNumber)` - returns the account identified by the specified account number
- `int[] getAccountNumbers()` - returns a list of account numbers held by the bank
- `Account openAccount(double balance, String accountType)` - creates a new account with the specified balance and adds it the bank's list.
  - An `accountType` value of "current" will create a `CurrentAccount` instance, a value of "savings" will create a `SavingsAccount` instance and any other value should create an `Account` instance
- `void payDividend(double dividend)` - pays a dividend to all accounts held by the bank
- `void update()` - iterates through each account, updating it in the following ways: 
  - `SavingsAccount` instances get interest added (via the method you already wrote)
  - `CurrentAccount` instances get a letter sent to the account holder if they are in overdraft.

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