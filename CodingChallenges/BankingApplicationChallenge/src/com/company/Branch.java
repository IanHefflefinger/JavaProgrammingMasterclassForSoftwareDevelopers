package com.company;

import java.util.ArrayList;

public class Branch {
    // instance variables
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    // constructor
    public Branch(String branchName, ArrayList<Customer> customers) {
        this.branchName = branchName;
        this.customers = customers;
    }

    // helper methods
    private boolean validateCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getCustomerName().equals(customerName)) {
                return true;
            }
        }
        return false;
    }
}
