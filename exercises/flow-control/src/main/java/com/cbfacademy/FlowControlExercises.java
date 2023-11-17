package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        // throw new RuntimeException("Not implemented");
        List<String> result = new ArrayList<>();

        for(Integer number : numbers){
            if(number % 3 == 0 && number % 5 == 0){
                result.add("FizzBuzz");
            }
            else if (number % 3 == 0){
             result.add("Fizz");   
            }
             else if (number % 5 == 0){
             result.add("Buzz");
             }  
             else {
                result.add(number.toString());
             }
            
       }
       return result;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        // throw new RuntimeException("Not implemented");
        String[] months ={
            "January", "February", "March", "April", "May", "June", 
    "July", "August", "September", "October", "November", "December"
        };
        // Check if the input number is within the valid range
        if (number >= 1 && number <= 12){

        // Subtracting 1 to align with the array indices
            return months[number -1]; 
        }
        else{
            return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        // throw new RuntimeException("Not implemented");
        // Create and initialize a list of 100 numbers from 1 to 100

        int[] numbers = new int[100];
        for (int i = 1; i <= 100; i++) {
            numbers[i - 1] = i;
        }

        // Initialize variables to store the sum of odds and evens
        int sumOfOdds = 0;
        int sumOfEvens = 0;

        // Determine the sum of odds and evens
        for (int number : numbers) {
            if (number % 2 == 0) {
                // Even number
                sumOfEvens += number;
            } else {
                // Odd number
                sumOfOdds += number;
            }
        }

        // Create and return a map with the calculated sums
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("SumOfEvens", sumOfEvens);
        resultMap.put("SumOfOdds", sumOfOdds);

        return resultMap;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        // throw new RuntimeException("Not implemented");
        List<Integer> reversedList = new ArrayList<>();

        // Iterate through the original list in reverse order and add elements to the new list
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedList.add(numbers.get(i));
        }

        return reversedList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
