package com.company;

public class Main {

    public static boolean isLeapYear(int year) {
        // check that year is in range: 1 -> 9999
        if (year < 1 || year > 9999) {
            return false;
        } else {
            // calculate if year is leap year
            return year % 4 == 0 && (year % 100 != 0) || year % 400 == 0;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        // check if month and year are in range: 1-12 (month) / 1 - 9999 (year)
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        // check if leap year and if February, then return 29
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        // run tests
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}

// This code works. I don't like it, but it works. For now, it will have to do.