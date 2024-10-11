package com.cbfacademy;

public class FizzBuzz {

       // Method to get the FizzBuzz output
       public String get(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    // Main method to test the FizzBuzz class
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        // Testing the get method with numbers 1 through 15 to match the chart
        for (int i = 1; i <= 15; i++) {
            System.out.println("Input: " + i + " -> Output: " + fizzBuzz.get(i));
        }
    }
}
