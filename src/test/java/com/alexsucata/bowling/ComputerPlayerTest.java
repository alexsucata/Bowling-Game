package com.alexsucata.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {

    @Test
    void addRandomFrame() {
        ComputerPlayer computerPlayer = new ComputerPlayer(1, "computer", ComputerPlayer.LEVELS.PRO);

        for (int i = 0; i < 10; i++) {
            computerPlayer.addRandomFrame();
        }

        assertEquals(154, computerPlayer.getGameScore());
    }
}