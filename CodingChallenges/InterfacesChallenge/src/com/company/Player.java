package com.company;

import java.util.ArrayList;

public class Player implements ISaveable {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public ArrayList returnArrayList() {
        return null;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                '}';
    }

    @Override
    public void populateFields() {

    }
}
