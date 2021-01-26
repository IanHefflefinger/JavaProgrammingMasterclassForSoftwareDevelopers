package com.company;

public class Main {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        // if any of the parameters are negative, return false
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // working variables
        int bigBagKilos = bigCount * 5;
        // if there aren't enough total kilos to satisfy order, return false
        if ((bigBagKilos + smallCount) < goal) {
            return false;
        }
        // first, check if the small bags are enough to satisfy the order
        for (int i = 0; i <= smallCount; i++) {
            if (i == goal) {
                return true;
            }
        }
        // next, check if large bags plus small bags are enough to satisfy the order
        int totalKilos = 0;

        // iterate over big bags and add small bags one at a time and then compare total to goal
        for (int i = 1; i <= bigCount; i++) {
            totalKilos += 5;
            // check if this iteration meets demand
            if (totalKilos == goal) {
                return true;
            }
            for (int j = 1; j <= smallCount; j++) {
                totalKilos += 1;
                if (totalKilos == goal) {
                    return true;
                }
            }
            // remove smallCount from total
            totalKilos -= smallCount;
        }
        // temp return
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
}
