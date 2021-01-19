package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 3;
	    if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

	    int switchValue = 1;
	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or a 5");
                System.out.println(("Actually is was a " + switchValue));
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        // challenge activity
        char charVal = 'z';
        System.out.println("Checking for A, B, C, D, or E");
	    switch(charVal) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found " + charVal);
                break;

            default:
                System.out.println(charVal + " not found");
        }

        String month = "January";
	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}
