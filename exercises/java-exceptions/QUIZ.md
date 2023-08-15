# Quiz Answers

<dl>
<dt>

### Question 1

Is the following code legal?

```java
try {

} finally {

}
```
</dt>
<dd>
Yes
</dd>
<dt>

### Question 2

What exception types can be caught by the following handler?
```java
catch (Exception e) {
    
}
```

What is wrong with using this type of exception handler?
</dt>
<dd>
All exception types will be caught
</dd>
<dd>
Using a catch block with the base `Exception` type is generally not advisable due to several reasons:

1. **Loss of Specificity**: The base `Exception` class is the superclass of all exceptions in Java, including both checked and unchecked exceptions. By catching all exceptions with a catch block for `Exception`, you lose the ability to differentiate between different types of exceptions. This can make debugging and troubleshooting more difficult, as you won't have access to specific exception information.

2. **Unhandled Subtypes**: If you catch the base `Exception` type, you might inadvertently catch exceptions that should be handled differently or allowed to propagate up the call stack. For example, if you have specific catch blocks for certain exceptions, those blocks won't be executed if you've already caught the exceptions using the base `Exception` catch block.

3. **Obscured Programming Errors**: Catching all exceptions with a `catch (Exception e)` block might hide programming errors that should be fixed. Unchecked exceptions, which are subclasses of `RuntimeException`, often represent errors that can be prevented by better coding practices. By catching them indiscriminately, you might mask issues that need to be addressed in the code.

4. **Poor Error Handling**: Precise error handling allows you to handle different exceptions in a more meaningful way. If you catch all exceptions with the base `Exception` type, you might end up using generic error messages or actions, which can confuse users and make it harder to diagnose problems.

5. **Maintenance and Refactoring**: If you catch all exceptions at a high level with a base `Exception` catch block, it can become challenging to refactor your code in the future. As your codebase evolves, you might introduce new exceptions or change the behavior of existing ones. If your catch blocks are too broad, they might not adapt well to these changes.

It's generally better practice to catch only the specific exceptions that your code can handle and let others propagate up the call stack if they can't be handled locally. This makes your error handling more meaningful, maintainable, and adaptable to changes in your codebase over time.
</dd>
<dt>

### Question 3

Is there anything wrong with the following exception handler as written? Will this code compile?

```java
try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}
```
</dt>
<dd>
The code will compile, but the more specific `catch` block for the `ArithmeticException` will never be executed, because Java executes the first applicable `catch` block it encounters.
</dd>
<dt>

### Question 4

```java
int[] A; 
A[0] = 0;
```

The above code produces (choose 1):

- [ ] an error
- [ ] a checked exception
- [ ] an unchecked exception
- [ ] a compile error
- [ ] no exception
</dt>
<dd>
An unchecked exception (`ArrayIndexOutOfBoundsException`).
</dd>
<dt>

### Question 5

The JVM starts running your program, but the JVM can't find the Java platform classes. 
(The Java platform classes reside in classes.zip or rt.jar.)

What happens (choose 1):

- [ ] an error
- [ ] a checked exception
- [ ] an unchecked exception
- [ ] a compile error
- [ ] no exception
</dt>
<dd>
An error.
</dd>
<dt>

### Question 6

A program is reading a stream and reaches the end of stream marker.

What happens (choose 1):

- [ ] an error
- [ ] a checked exception
- [ ] an unchecked exception
- [ ] a compile error
- [ ] no exception
</dt>
<dd>
No exception.
</dd>
<dt>

### Question 7

Before closing the stream and after reaching the end of stream marker, a program tries to read the stream again.

What happens (choose 1):

- [ ] an error
- [ ] a checked exception
- [ ] an unchecked exception
- [ ] a compile error
- [ ] no exception
</dt>
<dd>
Checked exception.
</dd>
</dl>
