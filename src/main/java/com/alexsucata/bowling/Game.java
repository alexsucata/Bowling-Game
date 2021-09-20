package com.alexsucata.bowling;

import java.util.ArrayList;

public class Game {

    private static final Integer FRAMES_PER_GAME = 10;

    private ArrayList<BowlingFrame> bowlingFrames;

    public Game() {
        bowlingFrames = new ArrayList<BowlingFrame>();
    }

    public Integer getGameScore() {
        Integer score = 0;
        for (int frameIndex = 0; frameIndex < bowlingFrames.size(); frameIndex++) {
            BowlingFrame bowlingFrame = bowlingFrames.get(frameIndex);

            score += bowlingFrame.getScore();

            if (bowlingFrame.isStrike()) {
                BowlingFrame nextFrame = (frameIndex < bowlingFrames.size() - 1 ? bowlingFrames.get(frameIndex + 1) : null);
                Integer nextFrameScore = (nextFrame != null ? nextFrame.getScore() : 0);
                score += nextFrameScore;

                if (nextFrame!= null && nextFrame.isStrike()) {
                    Integer nextNextFrameScore = (frameIndex < bowlingFrames.size() - 2 ? bowlingFrames.get(frameIndex + 2).getFirstRoll() : 0);
                    score += nextNextFrameScore;
                }
            } else if (bowlingFrame.isSpare()) {
                Integer nextFrameScore = (frameIndex < bowlingFrames.size() - 1 ? bowlingFrames.get(frameIndex + 1).getFirstRoll() : 0);
                score += nextFrameScore;
            }
        }
        return score;
    }

    public void addFrame(BowlingFrame frame) {
        if (bowlingFrames.size() >= FRAMES_PER_GAME)
            throw new IllegalArgumentException("You cannot add more than 10 frames per game");
        bowlingFrames.add(frame);
    }
}
