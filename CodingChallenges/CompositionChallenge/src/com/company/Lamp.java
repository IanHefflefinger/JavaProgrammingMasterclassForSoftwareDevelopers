package com.company;

public class Lamp {
    // instance variables
    private String style;
    private boolean battery;
    private int globRating;

    // constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // instance methods
    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    // getters
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
