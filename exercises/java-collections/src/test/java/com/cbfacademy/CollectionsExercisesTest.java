package com.cbfacademy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Collections Exercises")
public class CollectionsExercisesTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final CollectionsExercises exercise = new CollectionsExercises();

        final String name = exercise.getName();

        assertThat(name, is("Collections Exercises"));
    }

    @Test
    @DisplayName("working with LinkedLists")
    public void workWithLinkedLists() {
        final CollectionsExercises exercise = new CollectionsExercises();

        final LinkedList<Integer> result = exercise.useLinkedList();

        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(8));
        assertThat(result.get(0), is(4));
        assertThat(result.get(1), is(5));
        assertThat(result.get(2), is(4));
        assertThat(result.get(3), is(6));
        assertThat(result.get(4), is(8));
        assertThat(result.get(5), is(2));
        assertThat(result.get(6), is(9));
        assertThat(result.get(7), is(2));
        assertThat(outputStreamCaptor.toString().trim(), is("4"));
    }

    @Test
    @DisplayName("working with Stacks")
    public void workingWithStacks() {
        final CollectionsExercises exercise = new CollectionsExercises();

        final Stack<Integer> result = exercise.useStack();

        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(4));
        assertThat(result.get(0), is(5));
        assertThat(result.get(1), is(6));
        assertThat(result.get(2), is(8));
        assertThat(result.get(3), is(4));
        assertThat(outputStreamCaptor.toString().trim(), is("599"));
    }

    @Test
    @DisplayName("working with ArrayDeques")
    public void workingWithQueues() {
        final CollectionsExercises exercise = new CollectionsExercises();

        final ArrayDeque<Integer> result = exercise.useArrayDeque();

        final Integer[] array = result.toArray(new Integer[3]);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(3));
        assertThat(array[0], is(6));
        assertThat(array[1], is(8));
        assertThat(array[2], is(9));
        assertThat(outputStreamCaptor.toString().trim(), is("5956"));
    }

    @Test
    @DisplayName("working with HashMaps")
    public void workingWithMaps() {
        final CollectionsExercises exercise = new CollectionsExercises();

        final HashMap<Integer, String> result = exercise.useHashMap();

        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(6));
        assertThat(outputStreamCaptor.toString().trim(),
                is("[1, 2, 3, 4, 5, 6][TypeScript, Kotlin, Python, Java, JavaScript, Rust]false")
        );
    }
}
