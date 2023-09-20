package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {

    /**
     * Sorts an array using the Quicksort algorithm.
     *
     * @param arr        The array to be sorted.
     * @param startIndex The index of the first element in the array.
     * @param endIndex   The index of the last element in the array.
     */
    public void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(arr, startIndex, endIndex);

            sort(arr, startIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
        }
    }

    /**
     * Partitions the array based on a pivot element.
     *
     * @param arr        The array to be partitioned.
     * @param startIndex The index of the first element in the partition range.
     * @param endIndex   The index of the last element in the partition range.
     * @return The index of the pivot element after partitioning.
     */
    protected int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int boundaryIndex = startIndex - 1;

        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            if (arr[currentIndex] <= pivot) {
                boundaryIndex++;
                swap(arr, boundaryIndex, currentIndex);
            }
        }

        int pivotIndex = boundaryIndex + 1;

        swap(arr, pivotIndex, endIndex);

        return pivotIndex;
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr The array in which elements need to be swapped.
     * @param i   Index of the first element to swap.
     * @param j   Index of the second element to swap.
     */
    protected void swap(int[] arr, int i, int j) {
        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;
    }
}
