package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        
        // throw new RuntimeException("Not implemented");
        List<String> resultList = new ArrayList<>();

        for(int element : numbers) {
            if(element % 5 == 0 && element % 3 == 0) {
                resultList.add("FizzBuzz");
            } else if(element % 5 == 0) {
                resultList.add("Buzz");
            } else if(element % 3 == 0) {
                resultList.add("Fizz");
            } else {
                resultList.add(Integer.toString(element));
            }
        }
        return resultList;
    }

    public String whichMonth(Integer number) {
        String result;
        switch(number) {
            case 1:
            result =  "January";
            break;
            case 2:
            result =  "February";
            break;
            case 3:
            result =  "March";
            break;
            case 4:
            result =  "April";
            break;
            case 5:
            result =  "May";
            break;
            case 6:
            result =  "June";
            break;
            case 7:
            result =  "July";
            break;
            case 8:
            result =  "August";
            break;
            case 9:
            result =  "September";
            break;
            case 10:
            result =  "October";
            break;
            case 11:
            result =  "November";
            break;
            case 12:
            result =  "December";
            break;
            default: 
            result =  "Invalid month number";
        };
        return result;

    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
    //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        // throw new RuntimeException("Not implemented");
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            newList.add(i);      
        }
        int calculatedSumOfEvens = 0;
        int calculatedSumOfOdds = 0;
        for(int element : newList){ // will nto work unless you define the list as list<Integer> newList instead of just List newList
            if(element % 2 == 0){
                calculatedSumOfEvens += element;
            }else {
                calculatedSumOfOdds += element;
            }
        }
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("SumOfEvens", calculatedSumOfEvens);
        newMap.put("SumOfOdds", calculatedSumOfOdds);
        System.out.println(newList);
        return newMap;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODoO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
                
        // throw new RuntimeException("Not implemented");
        // for (int i = 0; i < (numbers.length()); i++) {
        //     number[0] = numbers[-1];
        //     numbers[1] = numbers[-2];
        //     numbers[i] = numbers[i-1];
            
        // }
        return numbers.reversed();
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
