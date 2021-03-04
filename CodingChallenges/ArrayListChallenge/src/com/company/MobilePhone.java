package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    // instance variables
    private static ArrayList<Contact> contacts = new ArrayList<Contact>();

    // instance methods
    public static void printMenu() {
        System.out.println("Select one of the following:");
        System.out.println("   1. Add new contact");
        System.out.println("   2. Print list of contacts");
        System.out.println("   3. Update existing contact");
        System.out.println("   4. Remove contact");
        System.out.println("   5. Quit");
    }

    public static void addContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter contact name:\r");
        String name = scanner.nextLine();

        System.out.println("Enter contact phone number:\r");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber);
    }

    public static void printContacts() {
        System.out.println("List of contacts:");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + ". " + contacts.get(i).getName());
        }
    }

//    private static boolean contactExists(Contact contact) {
//        for (int i = 0; i < contacts.size(); i++) {
//            if (contacts.get(i).getName().equals(contact.getName())) {
//                return true;
//            }
//        }
//        return false;
//    }
}
