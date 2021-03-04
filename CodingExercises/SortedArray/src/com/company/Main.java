package com.company;

import java.util.Scanner;

public class Main {
    public static int[] getIntegers(int nums) {
        int[] myArray = new int[nums];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + nums + " numbers:\r");
        for (int i = 0; i < nums; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] myArray) {
        // create new array as copy of original array
        int[] newArray = myArray.clone();
        // bubble sort
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] < newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] initArray = getIntegers(5);
        int[] sortedArray = sortIntegers(initArray);
        printArray(sortedArray);
    }
}
