package com.company;

public class Main {

    public static boolean hasTeen(int num1, int num2, int num3) {
        // cycle through and check if number is a teen number
        if (isTeen(num1)) {
            return true;
        } else if (isTeen(num2)) {
            return true;
        } else return isTeen(num3);
    }

    public static boolean isTeen(int checkMyNum) {
        return checkMyNum >= 13 && checkMyNum <= 19;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
}
