package com.company;

// it's god-awful, but it works
public class Main {
    // solve this using recursion
    public static int getLargestPrime(int number) {
        // boot out negative numbers
        if (number < 0 || number == 0 || number == 1) {
            return -1;
        }
        int currentPrime = 0;
        // number i can be divided by (if == 2, then it is prime)
        int currentDivisions = 0;
        // find current prime
        for (int i = 2; i <= number; i++) {
            // check if i is prime
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    currentDivisions++;
                }
            }
            // if (at this point) currentDivisions == 2, then i is prime
            if (currentDivisions == 2) {
                currentPrime = i;
            } else {
                currentPrime = 2;
            }
            // reset divisions
            currentDivisions = 0;

//            System.out.println("current number = " + number);
//            System.out.println("current prime = " + currentPrime);

            // recurse
            if (number % currentPrime == 0) {
                number /= currentPrime;
            }
        }
        return currentPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(16));
    }
}
