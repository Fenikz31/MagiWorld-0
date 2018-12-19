package com.fenikz.Main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void Given_personnagesLevel_When_getLife_Then_getGoodLife() {
        Player warrior = new Warrior(1,1,0,1,0, playerClass, playerIntelligence, playerPosition );
        Player mage = new Mage(1,5,0,1,4);
        Player prowler = new Prowler(1,8,0,1,7);
        assertEquals(5, warrior.getMplayerHealthPoints());
        assertEquals(25, mage.getMplayerHealthPoints());
        assertEquals(40, prowler.getMplayerHealthPoints());
    }

}