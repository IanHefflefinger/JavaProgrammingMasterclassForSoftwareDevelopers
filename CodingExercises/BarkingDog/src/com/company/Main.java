package com.company;

public class Main {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        } else if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else return hourOfDay < 8 || hourOfDay > 22;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
}
