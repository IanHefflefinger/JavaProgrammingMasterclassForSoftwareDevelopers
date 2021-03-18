package com.company;

import java.util.Scanner;

public class Main {
    private static int[] readIntegers(int count) {
        int[] myArray = new int[count];
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            Scanner scanner = new Scanner(System.in);
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] myArray) {
        int currentMin = myArray[0];
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] < currentMin) {
                currentMin = myArray[i];
            }
        }
        return currentMin;
    }

    public static void main(String[] args) {
        int[] myInts = readIntegers(6);
        int myMin = findMin(myInts);
        System.out.println(myMin);
    }
}
