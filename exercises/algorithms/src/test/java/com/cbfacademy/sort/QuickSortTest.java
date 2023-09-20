package com.cbfacademy.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

class QuickSortTest {
    private ArraySorter sorter;

    @BeforeEach
    void setup() {
        sorter = new QuickSort();
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("sort() method returns sorted array for unsorted input array")
    void sort_ReturnsSortedArrayForUnsortedInputArray(int[] arr, int[] sortedArr) {
        this.sorter.sort(arr, 0, arr.length - 1);

        assertArrayEquals(sortedArr, arr);
    }

    static Stream<Arguments> sort_ReturnsSortedArrayForUnsortedInputArray() {
        return Stream.of(
                Arguments.of(new int[] { 55, 18, -9, 3, 107, 24, 66, 0 }, new int[] { -9, 0, 3, 18, 24, 55, 66, 107 }),
                Arguments.of(new int[] { 5, 3, 8, 4, 2, 7, 1, 6 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }),
                Arguments.of(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                        new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 }),
                Arguments.of(new int[] { 29, 28, 27, 26, 25, 24, 23, 22, 21, 20 },
                        new int[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 }));
    }

    @Test
    @DisplayName("sort() method returns empty array for empty input array")
    void sort_ReturnsEmptyArrayForEmptyInputArray() {
        int[] arr = {};
        int[] sortedArr = {};

        this.sorter.sort(arr, 0, arr.length - 1);

        assertArrayEquals(sortedArr, arr);
    }

    @Test
    @DisplayName("sort() method returns original array for pre-sorted input array")
    void sort_ReturnsOriginalArrayForPresortedInputArray() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] sortedArr = { 1, 2, 3, 4, 5, 6 };

        this.sorter.sort(arr, 0, arr.length - 1);

        assertArrayEquals(sortedArr, arr);
    }
}
