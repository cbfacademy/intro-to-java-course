# Introduction to Java

[![Java Language](https://img.shields.io/badge/platform-OpenJDK-3A75B0.svg?logo=OpenJDK)][1]

This project will house exercises for the Introduction to Java course.

We'll be using the current long-term support version of Java, Java 17 LTS. 

This short guide describes:

- [How to install OpenJDK][2]
- [How to install and configure Visual Code Studio for Java Development][3]

## :coffee: Install OpenJDK

The Java Development Kit is platform specific. Follow the instructions described in each resource for your platform.

**Windows**

- [Installing OpenJDK with the MSI installer][4]

**Ubuntu Linux**

- [How to Install Java JDK 17 on Ubuntu 22.04][5]

**Mac OS**

- [Install OpenJDK 17 with Homebrew][6]

### :white_check_mark: Verify your installation

To verify that OpenJDK 17 has been successfully installed on your machine, open a terminal and run the following commands:

**Java Runtime Environment**

```bash
java -version
```

You should get the an ouput similar to this one:

```bash
openjdk version "17.0.6" 2023-01-23
OpenJDK Runtime Environment (build 17.0.6+9-61)
OpenJDK 64-Bit Server VM (build 17.0.6+9-61, mixed mode, sharing)
```

**Java Compiler**

```bash
javac -version
```

You should get the an ouput similar to this one:

```bash
javac 17.0.6
```

## :wrench: Visual Studio Code Configuration

```java
// TODO
```




[1]: https://www.java.com/en/download/help/whatis_java.html
[2]: #install-openjdk
[3]: #configure-visual-studio-code
[4]: https://access.redhat.com/documentation/en-us/openjdk/17/html/installing_and_using_openjdk_17_for_windows/installing_openjdk_msi_installer
[5]: https://www.itzgeek.com/how-tos/linux/ubuntu-how-tos/install-java-jdk-17-on-ubuntu-22-04.html
[6]: https://formulae.brew.sh/formula/openjdk@17