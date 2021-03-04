package com.company;

public class Car {
    // instance variables
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    // instance methods
    public String startEngine() {
        return this.getClass().getSimpleName() + " engine starting";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + " accelerating";
    }

    public String brake() {
        return this.getClass().getSimpleName() + " braking";
    }

    // getters
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
