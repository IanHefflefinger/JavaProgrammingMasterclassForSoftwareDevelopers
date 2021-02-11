package com.company;

public class VipCustomer {
    // instance variables
    private String name;
    private double creditLimit;
    private String emailAddress;

    // constructors
    public VipCustomer() {
        this.name = "Default name";
        this.creditLimit = 0;
        this.emailAddress = "null@email.com";
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = "null@email.com";
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
