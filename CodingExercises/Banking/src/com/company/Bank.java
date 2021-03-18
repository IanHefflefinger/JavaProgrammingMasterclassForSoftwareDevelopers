package com.company;

import java.util.ArrayList;

public class Bank {
    // instance variables
    private String name;
    private ArrayList<Branch> branches;

    // constructor
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    // instance methods
    public boolean addBranch(String branchName) {
        // check if branch exists first
        if (findBranch(branchName) != null) {
            return false;
        }
        Branch newBranch = new Branch(branchName);
        branches.add(newBranch);
        // test that branch was added successfully
        if (findBranch(branchName) != null) {
            return true;
        }
        return false;
    }

    // FIXME: fix null pointer exceptions
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
//        if (findBranch(branchName).newCustomer(customerName, initialTransaction)) {
//            return true;
//        }
//        return false; // FIXME: the above code did not work, but the below solved the null pointer exception. Use the below as an example for the rest of the code.
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null) {
            return foundBranch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
//        if (findBranch(branchName).addCustomerTransaction(customerName, transactionAmount)) {
//            return true;
//        }
//        return false;
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null) {
            return foundBranch.addCustomerTransaction(customerName, transactionAmount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) != null) {
            System.out.println("Customer details for branch " + branchName);
            for (int i = 0; i < findBranch(branchName).getCustomers().size(); i++) {
                System.out.println("Customer: " + findBranch(branchName).getCustomers().get(i).getName() + "[" + (i+1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    for (int j = 0; j < findBranch(branchName).getCustomers().get(i).getTransactions().size(); j++) {
                        System.out.println("[" + (j+1) + "]  " + "Amount " + findBranch(branchName).getCustomers().get(i).getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

    // helper methods
    private Branch findBranch(String branchName) { // FIXME: causing nullpointerexception
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }
}
