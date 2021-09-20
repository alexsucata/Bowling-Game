package com.alexsucata.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testPerfectGameScore() {

        Game testGame = new Game();
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));
        testGame.addFrame(new BowlingFrame(10, 0));

        Integer score = testGame.getGameScore();
        assertEquals(270, score);
    }

    @Test
    void testAllSpareGameScore() {

        Game testGame = new Game();
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));
        testGame.addFrame(new BowlingFrame(0, 10));

        Integer score = testGame.getGameScore();
        assertEquals(100, score);
    }
}