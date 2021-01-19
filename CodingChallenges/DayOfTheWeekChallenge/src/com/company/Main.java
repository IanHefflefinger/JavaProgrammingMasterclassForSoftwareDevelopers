package com.company;

public class Main {
    // using switch-case
//    public static void printDayOfTheWeek(int day) {
//        String dayToPrint = "";
//        switch (day) {
//            case 0:
//                dayToPrint = "Sunday";
//                break;
//            case 1:
//                dayToPrint = "Monday";
//                break;
//            case 2:
//                dayToPrint = "Tuesday";
//                break;
//            case 3:
//                dayToPrint = "Wednesday";
//                break;
//            case 4:
//                dayToPrint = "Thursday";
//                break;
//            case 5:
//                dayToPrint = "Friday";
//                break;
//            case 6:
//                dayToPrint = "Saturday";
//                break;
//            default:
//                dayToPrint = "Invalid day";
//        }
//        System.out.println(dayToPrint);
//    }

    // using if-else
    public static void printDayOfTheWeek(int day) {
        String dayToPrint = "";
        if (day == 0) {
            dayToPrint = "Sunday";
        } else if (day == 1) {
            dayToPrint = "Monday";
        } else if (day == 2) {
            dayToPrint = "Tuesday";
        } else if (day == 3) {
            dayToPrint = "Wednesday";
        } else if (day == 4) {
            dayToPrint = "Thursday";
        } else if (day == 5) {
            dayToPrint = "Friday";
        } else if (day == 6) {
            dayToPrint = "Saturday";
        } else {
            dayToPrint = "Invalid day";
        }
        System.out.println(dayToPrint);
    }

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }
}
