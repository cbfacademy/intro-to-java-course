package com.cbfacademy;

import com.cbfacademy.sort.QuickSort;
import com.cbfacademy.sort.ArraySorter;

public class App {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2, 7, 1, 6 };

        System.out.println("Original array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        ArraySorter sorter = new QuickSort();

        sorter.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
