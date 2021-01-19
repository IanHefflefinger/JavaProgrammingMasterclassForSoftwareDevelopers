package com.company;

public class Main {
    public static boolean hasSharedDigit(int num1, int num2) {
        int num1Digit = num1 % 10;
        int num2Digit = num2 % 10;

        // reject if out of range
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (num1 > 0) {
            num1Digit = num1 % 10;
            num1 /= 10;
            // testing
//            System.out.println(num1Digit);
//            System.out.println(num2Digit);
            // testing
            if (num1Digit == num2Digit) {
                return true;
            }
            while (num2 > 0) {
                num2Digit = num2 % 10;
                num2 /= 10;
                if (num1Digit == num2Digit) {
                    return true;
                }
            }
        }
        // if false
        return false;
    }

    public static void main(String[] args) {
        // tests
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }
}
