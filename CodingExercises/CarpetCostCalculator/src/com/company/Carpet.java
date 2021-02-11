package com.company;

public class Carpet {
    // instance variable
    private double cost;

    // constructor
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    // instance methods
    public double getCost() {
        return this.cost;
    }
}
