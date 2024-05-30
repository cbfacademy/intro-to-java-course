package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        String greeting = concatenate("hello", "Every", "One");
        System.out.println(greeting);
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Write code that concatenates the input parameters and returns the result
        String threeWords = word1.concat(word2).concat(word3);
        // return word1 + " " + word2 + " " + word3
        // return String.join(" ", word1, word2, word3);
        System.out.println(threeWords);
        return threeWords;
    }

    public static Boolean areEqual(String word1, String word2) {
        // Write code to determine whether the input parameters are equal strings
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
        // Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
