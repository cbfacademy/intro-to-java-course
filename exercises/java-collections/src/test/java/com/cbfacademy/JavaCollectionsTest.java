package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Java Collections Test Suite")
public class JavaCollectionsTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final JavaCollections exercise = new JavaCollections();

        final String name = exercise.getName();

        assertThat(name, is("Java Collections"));
    }
}
