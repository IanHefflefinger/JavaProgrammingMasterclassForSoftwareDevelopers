package com.company;

public class Main {
    public static void printSquareStar(int number) {
        // check if in range
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // iterate through and solve
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    // create a diagonal and print top and bottom lines
                    if (i == j || i == 0 || i == number - 1 || j == 0 || j == number - 1 || j == (number - (i + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
	    printSquareStar(8);
    }
}
