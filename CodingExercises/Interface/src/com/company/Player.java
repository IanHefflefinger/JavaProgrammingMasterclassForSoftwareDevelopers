package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    // instance variables
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    // constructor
    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // instance methods
    @Override
    public List<String> write() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add(0, this.getName());
        myList.add(1, "" + this.getHitPoints());
        myList.add(2, "" + this.getStrength());
        myList.add(3, this.getWeapon());
        return myList;
    }

    @Override
    public void read(List<String> myList) {
        if (myList != null && myList.size() > 0) {
            this.setName(myList.get(0));
            this.setHitPoints(Integer.parseInt(myList.get(1)));
            this.setStrength(Integer.parseInt(myList.get(2)));
            this.setWeapon(myList.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
