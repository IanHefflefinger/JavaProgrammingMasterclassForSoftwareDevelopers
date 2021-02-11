package com.company;

public class Circle {
    // instance variable
    private double radius;

    // constructor
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // instance methods
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }
}
