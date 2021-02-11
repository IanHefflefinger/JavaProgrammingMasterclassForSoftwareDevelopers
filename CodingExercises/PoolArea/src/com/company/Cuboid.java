package com.company;

public class Cuboid extends Rectangle {
    // instance variable
    private double height;

    // constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // instance methods
    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return (getArea() * this.height);
    }
}
