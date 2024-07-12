package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName(value = "Dice Game Test Suite")
public class DiceGameTest {
    /**
     * Test the play() method of the Game class. Uses Mockito to mock the Player
     * class.
     */
    @ParameterizedTest
    @MethodSource("getPlayerArguments")
    @DisplayName("Game plays correctly")
    public void play_ReturnsCorrectResultForPlayers(Player player1, Player player2, String expected) {
        // Arrange
        DiceGame game = new DiceGame(player1, player2);

        // Act
        String winner = game.play();

        // Assert
        assertThat(winner, is(equalTo(expected)));
    }

    private static Stream<Arguments> getPlayerArguments() {
        Player highRoller = mock(Player.class);
        Player midRoller = mock(Player.class);
        Player lowRoller = mock(Player.class);

        when(highRoller.roll()).thenReturn(6);
        when(midRoller.roll()).thenReturn(3);
        when(lowRoller.roll()).thenReturn(1);

        return Stream.of(
                arguments(highRoller, highRoller, null),
                arguments(highRoller, midRoller, highRoller.getName()),
                arguments(highRoller, lowRoller, highRoller.getName()),
                arguments(midRoller, highRoller, highRoller.getName()),
                arguments(midRoller, midRoller, null),
                arguments(midRoller, lowRoller, midRoller.getName()),
                arguments(lowRoller, lowRoller, null));
    }
}
