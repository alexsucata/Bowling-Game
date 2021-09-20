package com.alexsucata.bowling;


public class Player {

    private Integer id;
    private String name;
    private Game game;

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.game = new Game();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void addFrame(BowlingFrame bowlingFrame) {
        game.addFrame(bowlingFrame);
    }

    public Integer getGameScore() {
        return game.getGameScore();
    }
}
