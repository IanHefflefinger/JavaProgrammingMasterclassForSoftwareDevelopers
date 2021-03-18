package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
//        System.out.println("FIXME: addNewContact()");
        if (findContact(contact) < 0 && findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
//        System.out.println("FIXME: updateContact()");
        if (findContact(oldContact) >= 0) {
            // contact found - do update and return true *requirements suggests replacing one object with another - this is probably not best practice, but it's Tim's requirement so w/e
            this.myContacts.set(findContact(oldContact), newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
//        System.out.println("FIXME: removeContact()");
        if (findContact(contact) >= 0) {
            myContacts.remove(contact);
            return findContact(contact) <= 0;
        }
        return false;
    }

    private int findContact(Contact contact) {
//        System.out.println("FIXME: findContact()");
        for (int i = 0; i < myContacts.size(); i++) {
            if (contact.getName().equals(myContacts.get(i).getName()) && contact.getPhoneNumber().equals(myContacts.get(i).getPhoneNumber())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
//        System.out.println("FIXME: findContact()");
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
//        System.out.println("FIXME: queryContact()");
        int contactIndex = findContact(name);
        return myContacts.get(contactIndex);
    }

    public void printContacts() {
//        System.out.println("FIXME: printContacts()");
        System.out.println("Contact list:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
