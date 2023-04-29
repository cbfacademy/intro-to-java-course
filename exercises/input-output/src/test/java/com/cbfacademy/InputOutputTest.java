package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Input Output Test Suite")
public class InputOutputTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final InputOutput exercise = new InputOutput();

        final String name = exercise.getName();

        assertThat(name, is("Input Output"));
    }
}
