package com.company;

import java.util.ArrayList;

public class Monster implements ISaveable {
    private String monsterName;

    public Monster(String monsterName) {
        this.monsterName = monsterName;
    }

    @Override
    public ArrayList returnArrayList() {
        return null;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterName='" + monsterName + '\'' +
                '}';
    }

    @Override
    public void populateFields() {

    }
}
