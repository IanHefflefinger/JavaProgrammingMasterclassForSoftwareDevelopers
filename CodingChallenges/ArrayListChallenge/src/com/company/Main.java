package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initial menu to get things started
        MobilePhone.printMenu();
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() != 5) {
            MobilePhone.printMenu();
            if (scanner.nextInt() == 1) {
                MobilePhone.addContact();
            }
            if (scanner.nextInt() == 2) {
                MobilePhone.printContacts();
            }
        }
    }
    // I am at a loss. I'm not sure why the program is responding the way that it is.
}
