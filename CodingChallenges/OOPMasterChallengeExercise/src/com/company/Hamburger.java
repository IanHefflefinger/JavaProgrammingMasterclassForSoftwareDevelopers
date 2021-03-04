package com.company;

public class Hamburger {
    // instance variables
    private String name;
    private String breadRoll;
    private String meat;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean pickle = false;
    private boolean onion = false;
    private double basePrice;
    private double newPrice;
    private int numOfAdditionalItems;

    // constructor
    public Hamburger(String breadRoll, String meat, double basePrice) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    // helper methods
    public boolean maxAdditionalItems() {
        return numOfAdditionalItems <= 4;
    }

    // getters
    public double getPrice() {
        return newPrice + basePrice;
    }

    public int getNumOfAdditionalItems() {
        return numOfAdditionalItems;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLettuce(boolean lettuce) {
        if (maxAdditionalItems() && !this.lettuce) {
            this.lettuce = true;
            this.numOfAdditionalItems++;
            this.newPrice += .35;
        }
    }

    public void setTomato(boolean tomato) {
        if (maxAdditionalItems() && !this.tomato) {
            this.tomato = true;
            this.numOfAdditionalItems++;
            this.newPrice += .45;
        }
    }

    public void setPickle(boolean pickle) {
        if (maxAdditionalItems() && !this.pickle) {
            this.pickle = true;
            this.numOfAdditionalItems++;
            this.newPrice += .40;
        }
    }

    public void setOnion(boolean onion) {
        if (maxAdditionalItems() && !this.onion) {
            this.onion = true;
            this.numOfAdditionalItems++;
            this.newPrice += .55;
        }
    }

    // instance methods
    public void showPrice() {
        System.out.println(this.name + " price:");
        System.out.println("Base price = $" + this.basePrice);
        if (lettuce) {
            System.out.println("Lettuce: + .35");
        }
        if (tomato) {
            System.out.println("Tomato: + .45");
        }
        if (pickle) {
            System.out.println("Pickle: + .40");
        }
        if (onion) {
            System.out.println("Onion: + .55");
        }
        System.out.println("Total = $" + this.getPrice());
    }
}
