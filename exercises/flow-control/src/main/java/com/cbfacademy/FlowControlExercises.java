package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        // it creates a list where for each element of the input list ${numbers}
        // List<Integer> numbers;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
                result.add("FizzBuzz");
            } else if (numbers.get(i) % 3 == 0) {
                result.add("Fizz");
                // return numbers;
            } else if (numbers.get(i) % 5 == 0)
                result.add("Buzz");
            else {
                result.add(numbers.get(i).toString());
            }

        }
        return result;
        // - if the ${element} is divisible by 3, it adds “Fizz” to the list
        // - if the ${element} is divisible by 5, it adds “Buzz” to the list
        // - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the
        // list
        // - it adds the element to the list in any other case
        // - it returns the constructed list
        // throw new RuntimeException("Not implemented");
    }

    public static String whichMonth(Integer number) {
        // TODO - Implement this method such that
        // - it returns the month corresponding to the input ${number}

        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number";
        }
    }

    /*
     * public static void main(String[] args) {
     * Scanner input = new Scanner(System.in);
     * 
     * System.out.print("Enter a month number (1-12): ");
     * int number = input.nextInt();
     * 
     * String monthName = whichMonth(number);
     * System.out.println("Month: " + monthName);
     * 
     * FlowControlExercises sumOfOddsAndEvens = new FlowControlExercises();
     * Map<String, Integer> result = sumOfOddsAndEvens.sumOfOddsAndSumOfEvens();
     * 
     * System.out.println("Sum of Odd Numbers: " + result.get("sumOfOdds"));
     * System.out.println("Sum of Even Numbers: " + result.get("sumOfEvens"));
     * }
     */
    // - if the ${number} is invalid, the method should return "Invalid month
    // number"
    // throw new RuntimeException("Not implemented");

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        int sumOdds = 0;
        int sumEvens = 0;

        // - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> numbers = new ArrayList<>(100);
        // - determines the sum of all the even numbers in the list
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sumEvens += numbers.get(i);
            }

            // - determines the sum of all the odd numbers in the list
            else {
                sumOdds += numbers.get(i);
            }
        }
        // - returns a map with two entries:
        Map<String, Integer> result = new HashMap<>();
        result.put("SumOfOdds", sumOdds);
        result.put("SumOfEvens", sumEvens);

        return result;
        // {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        // throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        // - it takes an array list of integers
        ArrayList<Integer> reversedNumbers = new ArrayList<>(numbers);

        // Reversing the list using Collections.reverse() method
        Collections.reverse(reversedNumbers);

        // Returning the reversed list
        return reversedNumbers;
    }

    // - it returns the list in reverse order

    // return list1
    // throw new RuntimeException("Not implemented");

    public String getName() {
        return "Flow Control Exercises";
    }
}
