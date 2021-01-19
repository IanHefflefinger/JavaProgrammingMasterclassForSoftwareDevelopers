package com.company;

public class Main {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenDigitSum = 0;
        int lastNum = 0;
        do {
            lastNum = number % 10;
            number /= 10;
            if (lastNum % 2 == 0) {
                evenDigitSum += lastNum;
            }
        } while (number > 0);
        return evenDigitSum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
