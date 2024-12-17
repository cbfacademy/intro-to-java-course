package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
   
        List<String> result = new ArrayList<>();
        for (Integer number : numbers) {
        if (number % 3 == 0 && number % 5 == 0) {
            result.add("FizzBuzz");
        } else if (number % 3 == 0) {
            result.add("Fizz");
        } else if (number % 5 == 0) {
            result.add("Buzz");
        } else {
            result.add(String.valueOf(number));
        }
        }
        return result;
        
    }

    public String whichMonth(Integer number) {
        // Check if the number is valid (between 1 and 12) {
        if (number < 1 || number > 12) {
            return "Invalid month number";
        }
            // Array of month names
            
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
                    
      
      // Create a map to store the results
        Map<String, Integer> sumOfOddsAndSumOfEvens() {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().toList();
       int sumOfEvens = 0;
       int sumOfOdds = 0;

        //  calculate sums
            for (Integer number : numbers) {
            if (number % 2 == 0) {
            sumOfEvens += number;

            // Add to even sum
            } else {
                sumOfOdds += number;

            // Add to Odd sum
            }
            }
            // Create a map to store the results
            Map<String, Integer> result = new HashMap<>();
            result.put("SumOfEvens", sumOfEvens);
            result.put("SumOfOdds", sumOfOdds);

            // return the map
            return result;
        }
    
       
    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // Create a new list to avoid mordifying the original input list
        List<Integer> reversedList = new ArrayList<>(numbers);

        // Reverse the list using Collections.reverse
        Collections.reverse(reversedList);
        
        // Return the reversed list
        System.out.println("Original list: " + numbers);
        System.out.println("Reversed list: " + reversedList);
        return reversedList;
    }


    public String getName() {
        return "Flow Control Exercises";
    }

}