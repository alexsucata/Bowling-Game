package com.alexsucata.bowling;


public class Player {

    private Integer id;
    private String name;

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public void addFrame() {

    }
}
