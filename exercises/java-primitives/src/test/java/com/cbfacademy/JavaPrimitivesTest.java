package com.cbfacademy;

import com.cbfacademy.primitives.JavaPrimitives;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Java Primitives Test Suite")
public class JavaPrimitivesTest {

    @Test
    @DisplayName("returns this unit's name")
    public void returnUnitName() {
        final JavaPrimitives exercise = new JavaPrimitives();

        final String name = exercise.getName();

        assertThat(name, is("Java Primitives"));
    }
}
