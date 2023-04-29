package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "TDD Test Suite")
public class TestDrivenDevelopmentTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final TestDrivenDevelopment exercise = new TestDrivenDevelopment();

        final String name = exercise.getName();

        assertThat(name, is("Test Driven Development"));
    }
}
