package com.company;

public class Main {

    public static void printNumberInWord(int num) {
        String numWord = "";
        switch (num) {
            case 0:
                numWord = "ZERO";
                break;
            case 1:
                numWord = "ONE";
                break;
            case 2:
                numWord = "TWO";
                break;
            case 3:
                numWord = "THREE";
                break;
            case 4:
                numWord = "FOUR";
                break;
            case 5:
                numWord = "FIVE";
                break;
            case 6:
                numWord = "SIX";
                break;
            case 7:
                numWord = "SEVEN";
                break;
            case 8:
                numWord = "EIGHT";
                break;
            case 9:
                numWord = "NINE";
                break;
            default:
                numWord = "OTHER";
        }
        System.out.println(numWord);
    }

    public static void main(String[] args) {

        printNumberInWord(-1);
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);

    }
}
