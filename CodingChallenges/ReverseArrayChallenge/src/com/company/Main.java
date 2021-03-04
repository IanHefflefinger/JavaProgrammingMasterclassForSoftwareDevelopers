package com.company;

import java.util.Arrays;

public class Main {
    private static void reverse(int[] myArray) {
        // for the sake of experimentation, I am going to swap values from the outside in using a temp var. *An
        // alternative would be to create a new array in the reverse order (easy to implement) and then change the
        // values of the old array using the new ones.
        int temp;
        for (int i = 0; i < myArray.length / 2; i++) {
//            System.out.println("first = " + myArray[i]);
//            System.out.println("last = " + myArray[myArray.length - 1 - i]);
            temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
