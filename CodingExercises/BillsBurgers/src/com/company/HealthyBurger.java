package com.company;

public class HealthyBurger extends Hamburger {
    // instance variables
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    // constructor
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    // instance methods
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
//        FIXME: output is out of order, but requirements definitions are poorly written - this will require some thought
        if (this.healthyExtra1Name != null) {
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
    }
}
