package com.company;

public class Point {
    // instance variables
    private int x;
    private int y;

    // no-arg constructor
    public Point() {
        // do nothing?
    }

    // x and y arg constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // methods
    public double distance() {
        return (Math.sqrt((this.x - 0)*(this.x - 0)+(this.y - 0)*(this.y - 0)));
    }

    public double distance(int x, int y) {
        return (Math.sqrt((this.x - x)*(this.x - x)+(this.y - y)*(this.y - y)));
    }

    public double distance(Point second) {
        return (Math.sqrt((this.x - second.x)*(this.x - second.x)+(this.y - second.y)*(this.y - second.y)));
    }
}
