package com.company;

public class Main {
    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        } else {
            // add up all digits in number and return total
            do {
                int leastSigDig = number % 10;
//                System.out.println(leastSigDig);
                number = (number - leastSigDig) / 10;
                sum += leastSigDig;
            } while (number > 0);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum is " + sumDigits(125));
        System.out.println("The sum is " + sumDigits(-125));
        System.out.println("The sum is " + sumDigits(5));
        System.out.println("The sum is " + sumDigits(32123));
    }
}
