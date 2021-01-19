package com.company;

public class Main {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        // check if numbers are in range
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        // set last digit of each parameter
        int num1Last = num1 % 10;
        int num2Last = num2 % 10;
        int num3Last = num3 % 10;
        // check if at least 2 numbers are equal
        return (num1Last == num2Last) || (num2Last == num3Last) || (num1Last == num3Last);
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    public static void main(String[] args) {
        //tests
        System.out.println(hasSameLastDigit(41, 22, 71)); // true
        System.out.println(hasSameLastDigit(23, 32, 42)); // true
        System.out.println(hasSameLastDigit(9, 99, 999)); // false

//        System.out.println(isValid(10));
//        System.out.println(isValid(468));
//        System.out.println(isValid(1051));
    }
}
