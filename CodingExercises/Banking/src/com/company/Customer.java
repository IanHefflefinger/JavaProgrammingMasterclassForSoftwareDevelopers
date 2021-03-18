package com.company;

import java.util.ArrayList;

public class Customer {
    // instance variables
    private String name;
    private ArrayList<Double> transactions;

    // constructor
    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.addTransaction(initialTransaction);
    }

    // instance methods
    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
