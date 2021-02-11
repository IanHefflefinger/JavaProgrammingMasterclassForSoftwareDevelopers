package com.company;

public class Calculator {
    // instance variables
    private Floor floor;
    private Carpet carpet;

    // constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // instance methods
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
