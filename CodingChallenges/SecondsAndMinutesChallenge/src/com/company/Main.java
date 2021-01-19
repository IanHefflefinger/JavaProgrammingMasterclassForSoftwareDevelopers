package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(543, 34));
        System.out.println(getDurationString(56789));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        } else {
            return "Invalid value";
        }
    }

    private static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return "Invalid value";
        }
    }
}
