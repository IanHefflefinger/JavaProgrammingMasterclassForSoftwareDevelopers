package com.company;

public class Main {

    public static boolean isPalindrome(int number) {
        // turn negative numbers into positive - easier to deal with
        if (number < 0) {
            number *= -1;
        }
        int reverseNumber = 0;
        int ourNum = number;
        while (ourNum > 0) {
            int lastDigit = ourNum % 10;
//            System.out.println(lastDigit);
            ourNum /= 10;
            reverseNumber += lastDigit;
            reverseNumber *= 10;
//            System.out.println(reverseNumber);
        }
        reverseNumber /= 10;
//        System.out.println(reverseNumber);
//        System.out.println(number);
        return (reverseNumber == number);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
