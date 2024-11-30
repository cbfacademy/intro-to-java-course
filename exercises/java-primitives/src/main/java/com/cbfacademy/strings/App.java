package com.cbfacademy.strings;

public class App {
    public static void main(String[] args) {
        // Example test cases to verify functionality
        System.out.println(concatenate("Hello", "World", "Java")); // Output: HelloWorldJava
        System.out.println(areEqual("Test", "Test")); // Output: true
        System.out.println(areEqual("Test", "test")); // Output: false
        System.out.println(format("Apple iPhone 15 Pro", 47, 1199.99)); // Output: Item: Apple iPhone 15 Pro. Price: £1199.99. Quantity: 47
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Concatenates the input strings and returns the result
        return word1 + word2 + word3;
    }

    public static Boolean areEqual(String word1, String word2) {
        // Compares the two strings and returns true if they are equal (case-sensitive)
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
        // Formats the string with item, price with £ symbol, and quantity
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
