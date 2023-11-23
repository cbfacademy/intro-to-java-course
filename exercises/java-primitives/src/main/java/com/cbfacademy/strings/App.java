package com.cbfacademy.strings;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
        return  word1.concat(word2).concat(word3); 
        
    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
        if (word1.equals(word2)){
            return true;
        }else{
            return false;
        }
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]"
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
