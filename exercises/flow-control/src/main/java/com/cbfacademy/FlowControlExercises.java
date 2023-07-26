package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        List<String> strings = new ArrayList<String>();

        numbers.forEach(number -> {
            if (number % 5 == 0 && number % 3 == 0) {
                strings.add("FizzBuzz");
            } else if (number % 3 == 0) {
                strings.add("Fizz");
            } else if (number % 5 == 0) {
                strings.add("Buzz");
            } else {
                strings.add(number.toString());
            }
        });

        return strings;

    }

    public String whichMonth(Integer number) {
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
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

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        List<Integer> numbers = new ArrayList<Integer>();
        int sumOfEvens = 0;
        int sumOfOdds = 0;

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvens += number;
            } else {
                sumOfOdds += number;
            }
        }

        final int calculatedSumOfEvens = sumOfEvens;
        final int calculatedSumOfOdds = sumOfOdds;

        return new HashMap<String, Integer>() {
            {
                put("SumOfEvens", calculatedSumOfEvens);
                put("SumOfOdds", calculatedSumOfOdds);
            }
        };
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        Collections.reverse(numbers);

        return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
