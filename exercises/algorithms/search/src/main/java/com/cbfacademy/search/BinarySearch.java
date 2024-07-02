package com.cbfacademy.search;
public class BinarySearch implements Search {
    @Override
    public int search(int[] sortedArray, int target){
        // The binarySearch method should not be static since it is part of an interface implementation
        // Must provide a return type: int in this case

        // Introduce the two indices: left and right
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = (left + right)/2;

            if (target == sortedArray[mid]){
                // return the index number for the mid point of the array 
                return mid;
            }else if (target > sortedArray[mid]) { // target could be on the right side of the array
                // set the left index to the right of the middle 
                left = mid + 1; // set the new left as the previous left will be discarded 
            } else { // target could be on the left side of the array
                // set the right index to the left of the middle
                right = mid -1; // set the new right which is the last item on the previous left if target > array[mid]
            }
        }

        // Target not found
        return  -1;

    }
    
}

// ./mvnw --projects search clean test -Dtest=BinarySearchTest