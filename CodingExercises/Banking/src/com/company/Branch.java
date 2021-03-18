package com.company;

import java.util.ArrayList;

public class Branch {
    // instance variables
    private String name;
    private ArrayList<Customer> customers;

    // constructor
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    // instance methods
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            Customer newCustomer = new Customer(customerName, initialTransaction);
            customers.add(newCustomer);
            // check that the above steps worked: checks that customer name exists and that the transaction (or one of the same value ***not great, but needs to pass Tim's test code***)
            if (findCustomer(customerName) != null && newCustomer.getTransactions().contains(initialTransaction)) {
                return true;
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer != null) {
            foundCustomer.addTransaction(transaction);
            // check that transaction was added successfully
            if (foundCustomer.getTransactions().contains(transaction)) {
                return true;
            }
        }
        return false;
    }

    // helper methods
    private Customer findCustomer(String customerName) { // FIXME: error somewhere here that prevents new customers from being added - woot woot! - fixed!!!
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return customers.get(i);
            }
        }
        return null;
    }
}
