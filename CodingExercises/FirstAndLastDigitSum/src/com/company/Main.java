package com.company;

public class Main {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return number + number;
        } else {
            int firstDigit = number % 10;
            int lastDigit = 0;

            while (number > 0) {
                int currentDigit = number % 10;
                number /= 10;
//                System.out.println(number);
//                System.out.println(currentDigit);
              if (number == 0) {
                  lastDigit = currentDigit;
              }
            }
//            System.out.println("first digit is " + firstDigit);
//            System.out.println("last digit is " + lastDigit);
            return firstDigit + lastDigit;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
