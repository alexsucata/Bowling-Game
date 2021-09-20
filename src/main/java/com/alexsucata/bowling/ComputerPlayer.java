package com.alexsucata.bowling;

public class ComputerPlayer extends Player{

    private enum level {BEGINNER, MEDIUM, ADVANCED, PRO};

    public ComputerPlayer(Integer id, String name) {
        super(id, name);
    }

    @Override
    public void addFrame() {
        super.addFrame();
    }
}
