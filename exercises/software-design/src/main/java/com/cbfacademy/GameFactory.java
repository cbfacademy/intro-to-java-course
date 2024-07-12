package com.cbfacademy;

public class GameFactory {
    /**
     * Creates a new dice game.
     *
     * @return A dice game.
     */
    public static DiceGame create() {
        return new DiceGame();
    }
}
