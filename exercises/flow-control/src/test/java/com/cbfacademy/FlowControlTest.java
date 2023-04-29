package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Flow Control Test Suite")
public class FlowControlTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final FlowControl exercise = new FlowControl();

        final String name = exercise.getName();

        assertThat(name, is("Flow Control"));
    }
}
