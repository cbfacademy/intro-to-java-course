package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Object-Oriented Programming Test Suite")
public class ObjectOrientedProgrammingTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final ObjectOrientedProgramming exercise = new ObjectOrientedProgramming();

        final String name = exercise.getName();

        assertThat(name, is("Object-Oriented Programming"));
    }
}