package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Java Exceptions Test Suite")
public class JavaExceptionsTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final JavaExceptions exercise = new JavaExceptions();

        final String name = exercise.getName();

        assertThat(name, is("Java Exceptions"));
    }
}
