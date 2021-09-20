package com.alexsucata.bowling;

public class BowlingFrame {

    private Integer firstRoll;
    private Integer secondRoll;

    public BowlingFrame(Integer firstRoll, Integer secondRoll) {
        if (firstRoll < 0 || firstRoll > 10)
            throw new IllegalArgumentException("First roll cannot be smaller than 0 or larger than 10");
        if (secondRoll < 0 || secondRoll > 10 - firstRoll)
            throw new IllegalArgumentException("Sum of rolls cannot be larger than 10");

        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    public Integer getFirstRoll() {
        return firstRoll;
    }

    public Integer getSecondRoll() {
        return secondRoll;
    }

    public boolean isStrike() {
        return firstRoll == 10;
    }

    public boolean isSpare() {
        return !isStrike() && (firstRoll + secondRoll == 10);
    }

    public Integer getScore() {
        return firstRoll + secondRoll;
    }
}
