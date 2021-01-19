package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Ian", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(200));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double totalInches = inches + feet * 12;
            double centimeters = totalInches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches is " + centimeters + " centimeters");
            return centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            int feet = inches / 12;
            int inches2 = inches % feet;
            return calcFeetAndInchesToCentimeters(feet, inches2);
        } else {
            return -1;
        }
    }
}
