package com.company;

public class Main {
    public static void numberToWords(int number) {
        // set initial length of number
        int initNumLength = getDigitCount(number);
        // reverse number so it prints in the proper order
        number = reverse(number);
        // set initial length of reversed number
        int reversedNumber = number;
        // check if in range
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        while (number > 0) {
            int lastNumber = number % 10;
            String numWord = "";
            switch (lastNumber) {
                case 0:
                    numWord = "Zero";
                    break;
                case 1:
                    numWord = "One";
                    break;
                case 2:
                    numWord = "Two";
                    break;
                case 3:
                    numWord = "Three";
                    break;
                case 4:
                    numWord = "Four";
                    break;
                case 5:
                    numWord = "Five";
                    break;
                case 6:
                    numWord = "Six";
                    break;
                case 7:
                    numWord = "Seven";
                    break;
                case 8:
                    numWord = "Eight";
                    break;
                case 9:
                    numWord = "Nine";
                    break;

            }
            System.out.println(numWord);
            number /= 10;
        }
        // if the number has trailing zeros, print them separately
        if (initNumLength > getDigitCount(number)) {
//            System.out.println(initNumLength);
//            System.out.println(getDigitCount(reversedNumber));
            int difference = initNumLength - getDigitCount(reversedNumber);
//            System.out.println(difference);
            while (difference > 0) {
                System.out.println("Zero");
                difference--;
            }
        }
    }
    // there is a bug in here that ignores trailing zeros - it needs to be fixed in the calling method
    public static int reverse (int number) {
        // if number is negative, make it positive for the calculation and flip it back later.
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }
        int lastNumber;
        int reversedNumber = 0;
        while (number > 0) {
            lastNumber = number % 10;
            number /= 10;
//            System.out.println(lastNumber);
//            System.out.println(Math.pow(10, getDigitCount(number)));
            reversedNumber += (lastNumber * Math.pow(10, getDigitCount(number)));
        }
        // if number was negative, now it is time to flip it back
        if (isNegative) {
            reversedNumber *= -1;
        }
//        System.out.println(reversedNumber);
        // don't get confused by this
        return reversedNumber;
    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
//        test getDigitCount() - all tests passed
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        test numberToWords()
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
//        test reverse()
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
        System.out.println(reverse(5));
    }
}

// fix bug
