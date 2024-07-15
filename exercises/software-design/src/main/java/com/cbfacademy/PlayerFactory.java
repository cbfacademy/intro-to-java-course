package com.cbfacademy;

public class PlayerFactory {
    /**
     * Creates a new player.
     *
     * @return A new player.
     */
    public static DicePlayer create() {
        return new DicePlayer();
    }
}
