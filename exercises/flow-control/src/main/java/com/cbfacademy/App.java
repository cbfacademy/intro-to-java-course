package com.cbfacademy;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }FizzBuzz fb = new FizzBuzz();
    List<Integer> numbers = Arrays.asList(1, 3, 5, 15, 16, 20, 30);
    List<String> result = fb.fizzBuzz(numbers);
    System.out.println(result);
}
