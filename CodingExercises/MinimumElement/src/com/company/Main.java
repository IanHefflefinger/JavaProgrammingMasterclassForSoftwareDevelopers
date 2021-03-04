package com.company;

import java.util.Scanner;

public class Main {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements should the array contain?\r");
        return scanner.nextInt();
    }

    private static int[] readElements(int numElements) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[numElements];
        System.out.println("Enter " + numElements + " numbers:\r");
        for (int i = 0; i < numElements; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] myArray) {
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int elements = readInteger();
        int[] theElements = readElements(elements);
        int ourMin = findMin(theElements);
        System.out.println("The minimum number is " + ourMin);
    }
}
