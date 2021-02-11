package com.company;

public class Floor {
    // instance variables
    private double width;
    private double length;

    // constructor
    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // instance methods
    public double getArea() {
        return this.width * this.length;
    }
}
