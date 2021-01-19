package com.company;

public class Main {

    public static boolean hasEqualSum(int one, int two, int three) {
        return three == two + one;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
}
