package com.cbfacademy.operators;

public class App {
    
    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
    return operand1 * operand2;
    }

    public static Boolean areEqual(double operand1, double operand2) {
     return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return operand1 > operand2;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Testing Arithmetic operators
        System.out.println(add(5.5, 4.5));
        System.out.println(subtract(10.0, 4.5));
        System.out.println(multiply(2.0, 3.5));

        // Testing relational operators
        System.out.println(areEqual(5.0, 5.0)); 
        System.out.println(isLessThan(3.0, 5.0));
        System.out.println(isMoreThan(6.0, 2.0));

        // Urinary operator Behaviour
        int number1 = 12;
        int number2 = 12;

        System.out.println(number1++); 
        System.out.println(++number2);
    }
}
