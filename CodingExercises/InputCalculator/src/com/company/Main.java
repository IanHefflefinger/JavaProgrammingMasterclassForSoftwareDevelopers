package com.company;

import java.util.Scanner;

public class Main {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int count = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }

        // obviously, there is a bug somewhere that needs to be hashed out
//        float avg = sum / count;
//        if (avg)
        System.out.println("SUM = " + (long) sum + " AVG = " + (long) Math.ceil(sum/count));
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
