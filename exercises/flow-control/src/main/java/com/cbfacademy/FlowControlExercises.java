package com.cbfacademy;

import java.util.*;
import java.util.stream.IntStream;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
//        throw new RuntimeException("Not implemented");
        final List<String> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 15 == 0) {
                result.add("FizzBuzz");
            } else if (number % 5 == 0) {
                result.add("Buzz");
            } else if (number % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(number.toString());
            }
        }
        return result;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        //        throw new RuntimeException("Not implemented");
        String monthName;
        switch (number) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";
                break;
        }
        return monthName;
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
//        throw new RuntimeException("Not implemented");
        final IntStream range = IntStream.range(1, 100);
        final IntStream anotherRange = IntStream.range(1, 100);

        final Integer sumEvens = range.filter(number -> number % 2 == 0).sum();
        final Integer sumOdds = anotherRange.filter(number -> number % 2 != 0).sum();

        return new HashMap<>(){{
            put("SumOfEvens", sumEvens);
            put("SumOfOdds", sumOdds);
        }};
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
//        throw new RuntimeException("Not implemented");
        Collections.reverse(numbers);
        return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
