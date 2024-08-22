package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<String> result = new ArrayList<>();
       
        for (Integer number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if (number % 3 == 0) 
            result.add("Fizz");
        }

         else if (number % 5 == 0) {
            result.add("Buzz");
                }
                else {
                    result.add(number.toString());
                }
        
    }
    return result;
}
}


    public String whichMonth(Integer number) {

 String[] months = {
   "January", "February", "March", "April", "May", "June", "July",
    "August", "September", "October", "November", "December" };

    if(number >= 1 &7 number<= 12){
        return months [number - 1];
    } else {

    return  "Invalid month number";
        
    }
}


    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        int SumOfEvens = 0;
        int SumOfOdds = 0;

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            numbers.add(i);
        }
       
        for (Integer number = 1: numbers) {
            if (number % 2 == 0) {
                sumOfEvens += number;
            } else {
                sumOfOdds += number;
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("SumOfEvens", sumOfEvens);
        result.put("SumOfOdds", sumOfOdds);

        return result;
        
    }
    cd

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbers = new Arraylist<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> reversedNumbers = reverse(numbers);
        System.out.println(reversedNumbers); 

     List,Integer> reverse (ArrayList<Integer> numbers) {
        collections.reverse(numbers);
        return numbers;
     }
    }


    public String getName() {
        return "Flow Control Exercises";
    }

}

