package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Algorithms Test Suite")
public class AlgorithmsTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final Algorithms exercise = new Algorithms();

        final String name = exercise.getName();

        assertThat(name, is("Algorithms"));
    }
}
