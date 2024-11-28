package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        // Test the methods
        System.out.println("Hello World!");

        // Example test cases
        String concatenated = concatenate("Hello", " ", "World!");
        System.out.println("Concatenated: " + concatenated);

        Boolean equality = areEqual("Java", "java");
        System.out.println("Are Equal: " + equality);

        String formatted = format("Laptop", 2, 799.99);
        System.out.println("Formatted: " + formatted);
    }

    public static String concatenate(String word1, String word2, String word3) {
        return word1 + word2 + word3;
    }

    public static Boolean areEqual(String word1, String word2) {
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
