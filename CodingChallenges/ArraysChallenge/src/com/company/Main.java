package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int num) {
        int[] myArray = new int[num];
        System.out.println("Enter " + num + " numbers:\r");
        for (int i = 0; i < num; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static int[] sortArray(int[] intArray) {
        int[] newArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            // copy contents
            newArray[i] = intArray[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] < newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        printArray(sortArray(intArray));
    }
}
