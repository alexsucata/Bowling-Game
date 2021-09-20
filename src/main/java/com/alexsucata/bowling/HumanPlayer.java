package com.alexsucata.bowling;

public class HumanPlayer extends Player{

    public HumanPlayer(Integer id, String name) {
        super(id, name);
    }

    @Override
    public void addFrame(BowlingFrame bowlingFrame) {
        super.addFrame(bowlingFrame);
    }
}
