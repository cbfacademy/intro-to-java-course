package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Test arithmetic methods
        System.out.println("Addition: " + add(5.5, 3.2));  // Output: 8.7
        System.out.println("Subtraction: " + subtract(5.5, 3.2));  // Output: 2.3
        System.out.println("Multiplication: " + multiply(5.5, 3.2));  // Output: 17.6

        // Test relational methods
        System.out.println("Are Equal: " + areEqual(5.5, 5.5));  // Output: true
        System.out.println("Is Less Than: " + isLessThan(5.5, 3.2));  // Output: false
        System.out.println("Is More Than: " + isMoreThan(5.5, 3.2));  // Output: true

        // Test unary operators
        int number1 = 12;
        int number2 = 12;

        System.out.println(number1++);  // Output: 12
        System.out.println(++number2);  // Output: 13
    }

    public static double add(double operand1, double operand2) {
        return operand1 + operand2;  // Add operand1 and operand2
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;  // Subtract operand2 from operand1
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;  // Multiply operand1 and operand2
    }

    public static Boolean areEqual(double operand1, double operand2) {
        return operand1 == operand2;  // Check if operand1 is equal to operand2
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        return operand1 < operand2;  // Check if operand1 is less than operand2
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return operand1 > operand2;  // Check if operand1 is greater than operand2
    }
}
