package com.company;

public class Holden extends Car {
    // constructor
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    // instance methods
    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " engine starting";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " accelerating";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " braking";
    }
}
