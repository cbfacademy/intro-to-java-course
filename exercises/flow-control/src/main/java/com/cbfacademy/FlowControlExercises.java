package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (Integer number:numbers){
            if (number%3==0 && number%5==0) {
                result.add("FizzBuzz");}
                else if (number%3==0) {
                    result.add("Fizz");}
                else if (number%5==0) {
                    result.add("Buzz");}
                else {
                        result.add(number.toString());
                    }
                }
                return result;
            }
        

    public String whichMonth(Integer number) {
       
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
        List<Integer> numbers= new ArrayList<>();
        for (int i=1; i<=100; i++){
            numbers.add(i);
        }
        int sumofevens=0;
        int sumofodds=0;

        for (Integer number:numbers){
            if (number%2==0) {
                sumofevens += number;
            }
                else{
                    sumofodds += number;

                }
            }
            Map<String, Integer> result = new HashMap<>();
            result.put("Sumofevens", sumofevens);
            result.put("Sumofodds", sumofodds);

            return result;
        }
    

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        Collections.reverse(numbers);
        return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
