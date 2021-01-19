package com.company;

public class Main {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowerLimit = 25;
        int upperLimit = 35;
        // if summer, upper limit is raised to 45
        if (summer) {
            upperLimit = 45;
        }
        return temperature >= lowerLimit && temperature <= upperLimit;
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}
