package com.company;

public class Main {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes == 0) {
            System.out.println(minutes + " min = " + 0 + " y and " + 0 + " d");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days - (years * 365);
//            long remainingDays = days % (years * 365);
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
	    printYearsAndDays(525600);
	    printYearsAndDays(1051200);
	    printYearsAndDays(561600);
	    printYearsAndDays(1440);
	    printYearsAndDays(0);
    }
}
