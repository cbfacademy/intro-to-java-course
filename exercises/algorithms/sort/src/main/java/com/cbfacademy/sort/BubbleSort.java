import java.util.Random;
import java.util.Arrays; // need this as we need to print the array contensts, else it will only print the reference ID of the array object


public class BubbleSort {

    public static void main(String[] args) {
        Random rand = new Random(); // Initiliase a new instance using the Random class which was imported from java.util.Random

        int[] numbers = new int[10]; // Declare an array of size 10 

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(20); // Make the 10 items a list of random numbers from 0 to a million
        }

        // Before writing the algorith, let's output the array before they are sorted to help us visualise and compare to the final result
        System.out.println("Array before sorting: " + Arrays.toString(numbers));

        // Sorting algorithm
        // 1. loop through each 2 numbers and swap them - use a temp variable to do this
        
        boolean swappedSomething = true;

        while (swappedSomething) { // this will run infintely bec swappedSomething will always be true as it has been declared above 
            swappedSomething = false; // this will tell the prorgam, actually you havent swapped naything yet and it will loop through the numbers
            for (int i=0; i < numbers.length - 1; i++) {
                // you don't extend all the way till the las tindex because we won't have anything to compare that to
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true; // this will change it because if n on the right is bigger than n on the left - something will have to be swapped
                    int temp = numbers[i]; // introduce
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp; // this will only do one iteration of sorting, to do more until the array is correctly sorted:
                } 

            }
        }

        // After implementing our bubble sort algorithm, let's print the sorted array
        System.out.println("Bubble sorted array:" + Arrays.toString(numbers));

    }
    
}

// Big O(n^2) - the rate of sorting throught elemnets is equal to the numbe rof elements being sorted squares NOT EFFICIENT FOR LARGE DATA SETs e.g., an array of 1 million elements takes 37m to sort 