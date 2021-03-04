package com.company;

import java.util.Arrays;

public class Main {
    private static void reverse(int[] myArray) {
        System.out.println("Array = " + Arrays.toString(myArray));
        int temp;
        for (int i = 0; i < myArray.length / 2; i++) {
            temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(myArray));
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
