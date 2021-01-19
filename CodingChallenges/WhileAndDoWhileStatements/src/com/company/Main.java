package com.company;

public class Main {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEvenNumber(1));
        System.out.println(isEvenNumber(2));

        int count = 0;
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            count++;
            System.out.println("Even number " + number);
            if (count == 5) {
                break;
            }
        }
        System.out.println("Found " + count + " even numbers");
    }
}
