# Software Design

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of this exercise is to decouple tightly-coupled code by applying the following software design principles and patterns:

- [Inversion of Control](#pushpin-inversion-of-control)
- [Dependency Inversion Principle](#pushpin-dependency-inversion-principle)
- [Dependency Injection](#pushpin-dependency-injection)
- [IoC Containers](#pushpin-ioc-containers)

For this exercise, we've provided starter code in the `exercises/software-design` directory.  It contains a small program that plays a simulated game between two players rolling a dice.

We won't be changing the functionality of the application at all, but refactoring it to be loosely coupled.

In your terminal, navigate to the `software-design` directory, then run the following command to execute the application:

```shell
./mvnw -q clean compile exec:java
```

If you are on Windows, run this command instead:

```shell
mvnw -q clean compile exec:java
```

You should see output similar to this:

```shell
Game started. Target score: 30

Player 1 rolled a 4
Player 2 rolled a 5

Player 1 rolled a 4
Player 2 rolled a 5

Player 1 rolled a 4
Player 2 rolled a 6

Player 1 rolled a 5
Player 2 rolled a 1

Player 1 rolled a 6
Player 2 rolled a 3

Player 1 rolled a 4
Player 2 rolled a 2

Player 1 rolled a 4
Player 2 rolled a 4

Player 1 wins!
```

Open the `src/main/java/com/cbfacademy/` directory.

## :pushpin: Inversion of Control Principle

The `DiceGame` class calls `dicePlayer.roll()` in order to complete the `play()` method. `DiceGame` can't function without a `DicePlayer` instance, so we say that `DiceGame` **is dependent** on `DicePlayer` or that `DicePlayer` **is a dependency** of `DiceGame`.

The first step towards decoupling our code is to **invert** the control flow by using the [Factory pattern](https://refactoring.guru/design-patterns/factory-method) to implement IoC.

1. Examine the `PlayerFactory` and `GameFactory` classes.
2. Replace the `new DicePlayer()` statements in `DiceGame` with `PlayerFactory.create()`.
3. Replace the `new DiceGame()` statement in `App` with `GameFactory.create()`.
4. Run the application again to confirm you get the same output as before.
5. Commit your changes.

This delegated responsibility to the factory allows us to **decouple** the `DiceGame` class from the `DicePlayer` class.

## :pushpin: Dependency Inversion Principle

The Dependency Inversion Principle states that:
> 1. High-level modules should not depend on low-level modules. Instead, both should depend on abstractions.
> 2. Abstractions should not depend on details. Details should depend on abstractions.

Currently, our `DiceGame` class (high-level module) depends on `DicePlayer` (low-level module). This is a violation of the Dependency Inversion Principle, so we must replace this concrete dependency with an abstraction (interface or abstract class).

1. Examine the `Game` and `Player` interfaces.
2. Modify the `DiceGame` class to implement the `Game` interface and the `DicePlayer` class to implement the `Player` interface.
3. Modify the `GameFactory` and `PlayerFactory` classes to return instances of the `Game` and `Player` interfaces rather than the concrete classes.
4. Modify the `game` member in `App` to be of type `Game` rather than `DiceGame`.
5. Modify the `player1` and `player2` members in `DiceGame` to be of type `Player` rather than `DicePlayer`.
6. Run the application again to confirm you get the same output as before.
7. Commit your changes.

We have now implemented DIP, where a high-level module (`DiceGame`) and low-level module (`DicePlayer`) are both dependent on an abstraction (`Player`). Also, the abstraction (`Player`) doesn't depend on details (`DicePlayer`), but the details depend on an abstraction.

## :pushpin: Dependency Injection Pattern

We have now inverted control and introduced abstraction, but our classes are still tightly coupled to the factory classes. Let's resolve this by instead injecting dependencies into the constructor of the `DiceGame` class.

1. Modify the `DiceGame` constructor to accept two `Player` parameters.
2. Modify the `GameFactory.create()` method to accept two `Player` parameters and inject them into the `DiceGame` constructor.
3. Modify the `main` method in `App` to create two `Player` instances (using `PlayerFactory`) and pass them to the `GameFactory.create()` method.
4. Run the application again to confirm you get the same output as before.
5. Commit your changes.

By injecting the `Player` instances into the `DiceGame` constructor, we have now successfully decoupled `DiceGame` from `DicePlayer`.

## :pushpin: IoC Containers

While we've now decoupled our code, we still have to create instances of our interfaces using multiple factory classes. In a real-world application with numerous interfaces defined, this can quickly become a maintenance nightmare. To address this, we can use a **IoC Container** to manage our dependencies.

1. Examine the `SimpleContainer` class. It may contain code that looks unfamiliar, but focus on the comments describing the behaviour of the `register` and `create` methods.
2. Add the following method to the `App` class:
```java
    private static SimpleContainer initialiseContainer() {
        SimpleContainer container = new SimpleContainer();

        // Register mappings for any required interfaces with their concrete implementations

        return container;
    }
```
1. Modify the `initialiseContainer` method to register mappings for the `Game` and `Player` interfaces with their concrete implementations in the container, e.g. `container.register(Game.class, DiceGame.class)`
2. Add a call to `initialiseContainer` in the `main` method of `App`, before any factory method calls.
3. Replace the call to `GameFactory.create()` with `container.get(Game.class)`
4. Remove the calls to `PlayerFactory.create()`
5. Run the application again to confirm you get the same output as before.
6. Commit your changes.

By using a container, we're able to simplify our code and eliminate the need for multiple factory classes. This makes our code more modular, maintainable and easier to understand.
