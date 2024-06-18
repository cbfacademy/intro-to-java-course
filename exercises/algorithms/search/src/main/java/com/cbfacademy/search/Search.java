package com.cbfacademy.search;

public interface Search {
    /**
     * Searches an array.
     *
     * @param sortedArray The array to be searched (the array must be sorted)
     * @param target      The value being searched for
     * @return The array index of the target value, or -1 if the value is not found
     */
    int search(int[] sortedArray, int target);
}
