package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    // instance variables
    private String name;
    private int hitPoints;
    private int strength;

    // constructor
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    // instance methods
    @Override
    public List<String> write() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add(0, this.getName());
        myList.add(1, "" + this.getHitPoints());
        myList.add(2, "" + this.getStrength());
        return myList;
    }

    @Override
    public void read(List<String> myList) {
        if (myList != null && myList.size() > 0) {
            this.name = (myList.get(0));
            this.hitPoints = (Integer.parseInt(myList.get(1)));
            this.strength = (Integer.parseInt(myList.get(2)));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
