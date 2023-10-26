package com.cbfacademy.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName(value = "String Exercises")
public class AppTest {

    @ParameterizedTest
    @MethodSource
    @DisplayName("concatenate() method returns correctly concatenated string")
    public void concatenate_ReturnsConcatenatedString(String word1, String word2, String word3, String expected) {
        final String result = App.concatenate(word1, word2, word3);

        assertThat(result, is(equalTo(expected)));
    }

    static Stream<Arguments> concatenate_ReturnsConcatenatedString() {
        return Stream.of(
                arguments("Red", "Green", "Blue", "RedGreenBlue"),
                arguments("one", "two", "three", "onetwothree"),
                arguments("QUICK", "BROWN", "FOX", "QUICKBROWNFOX"),
                arguments("www.", "google.", "com", "www.google.com"),
                arguments("Intro ", "to ", "Java", "Intro to Java"));
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("areEqual() method returns equality of two strings")
    public void areEqual_ReturnsEqualityOfTwoStrings(String word1, String word2, Boolean expected) {
        final Boolean result = App.areEqual(word1, word2);
        final Boolean caseInsensitiveResult = App.areEqual(word1.toUpperCase(), word2.toLowerCase());

        assertThat(result, is(equalTo(expected)));
        assertThat(caseInsensitiveResult, is(false));
    }

    static Stream<Arguments> areEqual_ReturnsEqualityOfTwoStrings() {
        return Stream.of(
                arguments("Java", "Java", true),
                arguments("HTML", "HTML", true),
                arguments("beta", "beta", true),
                arguments("camel-case", "camel_case", false),
                arguments("WET", "wet", false),
                arguments("dry", "DRY", false));
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("format() method returns formatted string")
    public void format_ReturnsFormattedString(String item, int quantity, double price) {
        final String expected = formatItem(item, quantity, price);
        final String result = App.format(item, quantity, price);

        assertThat(result, is(equalTo(expected)));
    }

    static Stream<Arguments> format_ReturnsFormattedString() {
        return Stream.of(
                arguments("Laptop", 27, 2000),
                arguments("Mobile phone", 200, 999.99),
                arguments("Tablet", 85, 1199.9),
                arguments("Charger", 467, 29.999),
                arguments("USB cable", 883, 8.0001));
    }

    private String formatItem(String item, int quantity, double price) {
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
