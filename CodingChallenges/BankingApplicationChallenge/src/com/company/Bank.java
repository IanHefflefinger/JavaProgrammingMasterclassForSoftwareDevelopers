package com.company;

import java.util.ArrayList;

public class Bank {
    // instance variables
    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    // constructor
    public Bank(String bankName, ArrayList<Branch> branches) {
        this.bankName = bankName;
        this.branches = branches;
    }


}
