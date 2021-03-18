package com.company;

import java.util.ArrayList;

public class Customer {
    // instance variables
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    // instance methods
    public boolean addTransaction(Double transactionAmount) {
        transactions.add(transactionAmount);
        return true;
    }

    // constructor
    public Customer(String customerName, ArrayList<Double> transactions) {
        this.customerName = customerName;
        this.transactions = transactions;
    }

    // getters
    public String getCustomerName() {
        return customerName;
    }
}
