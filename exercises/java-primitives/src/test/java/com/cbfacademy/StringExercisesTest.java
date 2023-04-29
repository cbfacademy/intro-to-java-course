package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName(value = "String Exercises")
public class StringExercisesTest {

    @Test
    @DisplayName("returns this unit's exercises name")
    public void returnExerciseName() {
        final StringExercises exercise = new StringExercises();

        final String name = exercise.getName();

        assertThat(name, is("String Exercises"));
    }

    @ParameterizedTest
    @MethodSource("firstExerciseProvider")
    @DisplayName("returns a String from an array of characters")
    public void stringsFromCharacters(char[] characters, String expected) {
        final StringExercises exercise = new StringExercises();

        final String result = exercise.fromCharacters(characters);

        assertThat(result, equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("secondExerciseProvider")
    @DisplayName("counts the number of times a character is found in a string")
    public void howMany(String text, Character character, Long count) {
        final StringExercises exercise = new StringExercises();

        final Long result = exercise.howMany(text, character);

        assertThat(result, equalTo(count));
    }

    @ParameterizedTest
    @MethodSource("thirdExerciseProvider")
    @DisplayName("counts the number of times a character is found in a string")
    public void isPalindrome(String word, Boolean expected) {
        final StringExercises exercise = new StringExercises();

        final Boolean result = exercise.isPalindrome(word);

        assertThat(result, is(expected));
    }

    static Stream<Arguments> firstExerciseProvider() {
        return Stream.of(
                arguments(new char[]{'h', 'e', 'l', 'l', 'o'}, "hello"),
                arguments(new char[]{'w', 'o', 'r', 'l', 'd'}, "world"),
                arguments(new char[]{'C', 'B', 'F'}, "CBF"),
                arguments(new char[]{'a', 'c', 'a', 'd', 'e', 'm', 'y'}, "academy"),
                arguments(new char[]{'i', 'n', 't', 'r', 'o', '-', 't', 'o', '-', 'j', 'a', 'v', 'a'}, "intro-to-java")
        );
    }

    static Stream<Arguments> secondExerciseProvider() {
        return Stream.of(
                arguments(
                    "This section describes the Java Collections Framework. Here, you will learn what collections are " +
                    "and how they can make your job easier and programs better. You'll learn about the core elements — " +
                    "interfaces, implementations, aggregate operations, and algorithms — that comprise the Java " +
                    "Collections Framework.",
                    'g',
                    5L
                ),
                arguments(
                    "Java is a programming language and computing platform first released by Sun Microsystems in 1995. " +
                    "It has evolved from humble beginnings to power a large share of today’s digital world, by providing " +
                    "the reliable platform upon which many services and applications are built.",
                    'e',
                    18L
                )
        );
    }

    static Stream<Arguments> thirdExerciseProvider() {
        return Stream.of(
                arguments("anna", true),
                arguments("radar", true),
                arguments("refer", true),
                arguments("solos", true),
                arguments("noon", true),
                arguments("madam", true),
                arguments("typescript", false),
                arguments("javascript", false),
                arguments("java", false),
                arguments("street", false),
                arguments("apple", false),
                arguments("python", false),
                arguments("midnight", false)
        );
    }
}
