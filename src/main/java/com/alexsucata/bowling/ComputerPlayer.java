package com.alexsucata.bowling;

public class ComputerPlayer extends Player {

    public enum LEVELS {BEGINNER, ADVANCED, PRO};

    private LEVELS level;

    public ComputerPlayer(Integer id, String name, LEVELS level) {
        super(id, name);
        this.level = level;
    }

    public void addRandomFrame() {
        switch (level) {
            case BEGINNER:
                super.addFrame(new BowlingFrame(2,4));
                break;
            case ADVANCED:
                //todo
                super.addFrame(new BowlingFrame(4,5));
                break;
            case PRO:
                super.addFrame(new BowlingFrame(6,4));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + level);
        }
    }

    @Override
    public void addFrame(BowlingFrame bowlingFrame) {
        super.addFrame(bowlingFrame);
    }
}
