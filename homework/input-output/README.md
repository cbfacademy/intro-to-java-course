# Properties Files in Java

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise I/O concepts:
- Working with Properties files

For this assignment, we've provided the starter project above.

## :memo: Properties Files

- Create a program that loads the provided `example.properties` file, and prints each property and value to the screen.

- Create a program that creates a `configuration.properties` file, with the following properties:

```properties
db.url=localhost
db.port=5353
db.user=cbfacademy
db.password=password
```

- Both methods should make use of the Java [Properties](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Properties.html) class and relevant methods. 

Notes: 
- You should deal with any missing input such as an empty string for the filename, or an empty properties map. In these cases, you should return an empty properties object.
-  If the createFile method is given an existing filePath, it should **not** overwrite the contents of that file. 

[1]: https://docs.oracle.com/javase/21/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/