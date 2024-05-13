# Introduction to Java

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![MIT License](https://img.shields.io/badge/LICENSE-MIT-green.svg?style=for-the-badge)][13]

This project will house exercises for the Introduction to Java course.

We'll be using edition 21 of Java - Java 21 LTS. 

This short guide describes:

- [How to install OpenJDK][2]
- [How to install and configure Visual Code Studio for Java Development][3]

## :coffee: Install OpenJDK

The Java Development Kit is platform specific. Follow the instructions described in each resource for your platform.

**Windows**

- [Installing OpenJDK with the MSI installer][4]

**Ubuntu Linux**

- [How to Install Java JDK 21 on Ubuntu][5]

**macOS**

- [Install OpenJDK 21 with Homebrew][6]

### :white_check_mark: Verify your installation

To verify that OpenJDK 21 has been successfully installed on your machine, open a terminal and run the following commands:

**Java Runtime Environment**

```bash
java -version
```

You should get an ouput similar to this one:

```bash
openjdk version "21.0.3" 2024-04-16
OpenJDK Runtime Environment Homebrew (build 21.0.3)
OpenJDK 64-Bit Server VM Homebrew (build 21.0.3, mixed mode, sharing)
```

**Java Compiler**

```bash
javac -version
```

You should get an ouput similar to this one:

```bash
javac 21.0.3
```

## :wrench: Visual Studio Code Configuration

In this course, we are going to use [Visual Studio Code][7] as our code editor.
However, if you are familiar with [IntelliJ IDEA][8], feel free to use it throughout this course.

### Editor Configuration

Download and install Visual Studio Code on your machine, then install the [Extension Pack for Java][9].

Follow [this Java starting guide][10] to:
- create a simple Java project
- create and edit a simple source code file inside the project
- run the program using the editor "Run|Debug" button (as can be seen on the [video][11])

:tada: When the program runs and prints a `Hello World`, your local environment is correctly set up for the course.

## :rocket: Get Started

Now that your development environment is setup correctly, [fork][12] this repository, then clone your fork locally.

In the coming weeks, you will be actively writing Java code, and pushing your code to your fork.

**Happy learning! :smile:**



[1]: https://www.java.com/en/download/help/whatis_java.html
[2]: #coffee-install-openjdk
[3]: #wrench-visual-studio-code-configuration
[4]: https://learn.microsoft.com/en-us/java/openjdk/install?source=recommendations#install-on-windows-via-msi
[5]: https://learn.microsoft.com/en-us/java/openjdk/install?source=recommendations#install-on-ubuntu
[6]: https://formulae.brew.sh/formula/openjdk@21
[7]: https://code.visualstudio.com/
[8]: https://www.jetbrains.com/idea/download/
[9]: https://code.visualstudio.com/docs/java/java-tutorial#_installing-extensions
[10]: https://code.visualstudio.com/docs/java/java-tutorial#_creating-a-source-code-file
[11]: https://code.visualstudio.com/docs/java/java-tutorial/run-debug.mp4
[12]: https://docs.github.com/en/get-started/quickstart/fork-a-repo
[13]: https://github.com/cbfacademy/intro-to-java-course/blob/main/LICENSE