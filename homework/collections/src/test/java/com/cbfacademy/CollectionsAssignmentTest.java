package com.cbfacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Collections Assignment")
public class CollectionsAssignmentTest {

    private List<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new ArrayList<>(List.of(8, 12, 4, 10, 13, 5, 2, 12, 11, 14));
    }

    @Test
    @DisplayName("removes all elements smaller than a given value")
    void removeSmallValues() {
        CollectionsAssignment.removeSmallInts(numbers, 10);

        assertThat(numbers.size(), is(6));
        assertThat(numbers.get(0), is(12));
        assertThat(numbers.get(2), is(13));
        assertThat(numbers.get(5), is(14));
    }

    @Test
    @DisplayName("checks whether the list contains duplicates")
    void containsDuplicates() {
        final boolean result = CollectionsAssignment.containsDuplicates(numbers);
        assertThat(result, is(true));

        numbers.remove(12);
        final boolean anotherResult = CollectionsAssignment.containsDuplicates(numbers);
        assertThat(anotherResult, is(false));
    }

    @Test
    @DisplayName("returns a list of elements in either collection")
     void isInEither() {
        final HashSet<Integer> integers = new HashSet<>(Arrays.asList(8, 1, 5, 4, 3, 0, 6, 2, 9, 7));

        final ArrayList<Integer> result = CollectionsAssignment.inEither(numbers, integers);

        assertThat(result.size(), is(15));
        assertThat(result.containsAll(numbers), is(true));
        assertThat(result.containsAll(integers), is(true));
    }

    @Test
    @DisplayName("returns a list of elements that are in both collections")
    void isInBoth() {
        final HashSet<Integer> integers = new HashSet<>(Arrays.asList(8, 1, 5, 4, 3, 0, 6, 2, 9, 7));

        final ArrayList<Integer> result = CollectionsAssignment.inBoth(numbers, integers);

        assertThat(result.size(), is(4));
        assertThat(result.get(0), is(2));
        assertThat(result.get(1), is(4));
        assertThat(result.get(2), is(5));
        assertThat(result.get(3), is(8));
    }

    @Test
    @DisplayName("returns the most frequent element in the list")
    void mostFrequent() {
        final List<String> words = new ArrayList<>(
                List.of(
                    "final", "correct", "trial", "oral", "correct",
                    "oral", "gold", "figure", "trial", "correct",
                    "silver", "correct", "balsamic", "trial"
                )
        );

        final String result = CollectionsAssignment.mostFrequent(words);

        assertThat(result, is("correct"));
    }

    @Test
    @DisplayName("returns this assignment name")
    void returnExerciseName() {
        final String name = CollectionsAssignment.getName();

        assertThat(name, is("Collections Assignment"));
    }
}
