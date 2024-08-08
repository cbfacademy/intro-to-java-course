package com.cbfacademy;

/**
 * Represents a player that can roll a die.
 */
public interface Player extends Rollable {
    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    String getName();

    /**
     * Sets the name of the player.
     *
     * @param name The name of the player.
     */
    void setName(String name);
}
