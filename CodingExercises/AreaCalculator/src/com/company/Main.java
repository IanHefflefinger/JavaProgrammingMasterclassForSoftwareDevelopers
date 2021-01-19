package com.company;

public class Main {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            // calculate area of circle with provided radius
            return Math.PI * (radius * radius);
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            // calculate area of rectangle with provided dimensions
            return x * y;
        }
    }

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
}
