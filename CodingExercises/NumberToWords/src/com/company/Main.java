package com.company;

// I don't like the amount of bandaids in this code, but it passed all tests and I need to move on
public class Main {
    public static void numberToWords(int number) {
        // print Zero if so
        if (number == 0) {
            System.out.println("Zero");
        }
        // reject negative numbers
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        // record initial length of number before reversal
        int initialNumberLength = getDigitCount(number);
        // reverse number so words are printed in correct order
        number = reverse(number);
        // record reversed number length
        int reversedNumberLength = getDigitCount(number);
        // record differences between lengths
        int magnitude = initialNumberLength - reversedNumberLength;
        // logic to print words for each number
        while (number > 0) {
            // number to convert to word
            int currentNumber = number % 10;
            // word to print
            String wordToPrint = "";
            switch (currentNumber) {
                case 0:
                    wordToPrint = "Zero";
                    break;
                case 1:
                    wordToPrint = "One";
                    break;
                case 2:
                    wordToPrint = "Two";
                    break;
                case 3:
                    wordToPrint = "Three";
                    break;
                case 4:
                    wordToPrint = "Four";
                    break;
                case 5:
                    wordToPrint = "Five";
                    break;
                case 6:
                    wordToPrint = "Six";
                    break;
                case 7:
                    wordToPrint = "Seven";
                    break;
                case 8:
                    wordToPrint = "Eight";
                    break;
                case 9:
                    wordToPrint = "Nine";
                    break;
                default:
                    break;
            }
            // decrease number
            number /= 10;
            // print word
            System.out.println(wordToPrint);
        }
        // apply missing zeros
        if (magnitude > 0) {
            while (magnitude > 0) {
                System.out.println("Zero");
                magnitude--;
            }
        }
    }
//
    public static int reverse(int number) {
        // check if the number is negative, log so, and proceed with calculation *turn back into negative number afterwards
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }
        // logic to reverse number
        int reversedNumber = 0;
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
//            System.out.println(lastDigit);
            // if single number, continue
//            if (getDigitCount(number) == 1) {
//                reversedNumber = lastDigit;
//                continue;
//            }
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            number /= 10;
        }

        // turn back into negative number
        if (isNegative) {
            reversedNumber *= -1;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        // check that number is positive - return -1, otherwise
        if (number < 0) {
            return -1;
        }
        // check if the input number is 0, then return a 1 to indicate there is a single digit (logic will skip it)
        if (number == 0) {
            return 1;
        }
        // logic to check how many numbers in number
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        test getDigitCount
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        test reverse
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//        test numberToWords
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
        numberToWords(0);
    }
}


