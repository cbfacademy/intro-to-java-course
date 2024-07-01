package com.cbfacademy.search;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName(value = "Binary Search Exercise")
public class BinarySearchTest {
    Search binarySearch;
    static int[] testArray = new int[10000];

    @BeforeEach
    public void setUp() {
        binarySearch = new BinarySearch();
        Arrays.setAll(testArray, position -> position + 1);
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("search() method returns index of target value")
    public void search_ReturnsIndexOfTargetValue(int target) {
        int index = binarySearch.search(testArray, target);

        assertTrue(index == target - 1);
    }

    private static Stream<Arguments> search_ReturnsIndexOfTargetValue() {
        int maxIndex = testArray.length - 1;
        int[] targetIndices = { 0, 1, maxIndex / 4, maxIndex / 3, maxIndex / 2, maxIndex * 2 / 3, maxIndex * 3 / 4,
                maxIndex - 1, maxIndex }; // Test for values at relative positions rather than hard-coded indices
        List<Arguments> searchArguments = new ArrayList<>();

        for (int index : targetIndices) {
            searchArguments.add(Arguments.of(testArray[index]));
        }

        return searchArguments.stream();
    }

    @Test
    @DisplayName("search() returns -1 when the array has no elements")
    public void search_returnsMinusOneWhenArrayIsEmpty() {
        int[] emptyArray = new int[0];
        int result = binarySearch.search(emptyArray, 3);

        assertTrue(result == -1);
    }

    @Test
    @DisplayName("search() returns -1 when the target is not found")
    public void search_returnsMinusOneWhenTargetIsNotFound() {
        int result = binarySearch.search(testArray, testArray.length * 2);

        assertTrue(result == -1);
    }
}