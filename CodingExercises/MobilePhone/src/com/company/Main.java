package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("801 867 5309"); // this is just to instantiate an object/arraylist attached to this phone number - each phone number has its own list of contacts and to have an object to work with

    private static void printMenu() {
        System.out.println(
                "Enter one of the following options:\n" +
                "1. Print menu\n" +
                "2. Create contact\n" +
                "3. Print contacts\n" +
                "4. Update contact\n" +
                "5. Delete contact\n" +
                "6. Quit\r"
        );
    }

    public static void main(String[] args) {
        System.out.println("Starting program...");
        boolean quit = false;
        printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine(); // clears

            switch (action) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = scanner.nextLine();
                    Contact contact = new Contact(name, phoneNumber);
                    mobilePhone.addNewContact(contact);
                    break;
                case 3:
                    mobilePhone.printContacts();
                    break;
                case 4:
                    System.out.println("Enter contact name:");
                    String oldContactName = scanner.nextLine();
                    Contact oldContact = mobilePhone.queryContact(oldContactName);
                    // new contact info
                    System.out.println("Enter new name:");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new phone number:");
                    String newPhoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(newName, newPhoneNumber);
                    mobilePhone.updateContact(oldContact, newContact);
                    break;
                case 5:
                    System.out.println("Enter name of contact to delete:");
                    String contactNameDelete = scanner.nextLine();
                    Contact deleteMe = mobilePhone.queryContact(contactNameDelete);
                    mobilePhone.removeContact(deleteMe);
                    break;
                case 6:
                    System.out.println("Quitting application...");
                    quit = true;
            }
        }
    }
}
