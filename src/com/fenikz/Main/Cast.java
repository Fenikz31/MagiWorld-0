package com.fenikz.Main;

public interface Cast {

    /**
     * Run basic attack
     * @param player2 opponent player
     */
    void basicAttack(Player player2);

    /**
     * Run special attack
     * @param player2 opponent player
     */
    void specialAttack(Player player2);
}
