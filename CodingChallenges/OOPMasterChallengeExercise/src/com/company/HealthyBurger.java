package com.company;

public class HealthyBurger extends Hamburger {
    // instance variables
    private boolean kale = false;
    private boolean beanSprouts = false;
    private int numOfAdditionalItemsH;
    private double finalPrice;

    // constructor
    public HealthyBurger(String breadRoll, String meat, double price) {
        super(breadRoll, meat, price);
        breadRoll = "Brown rye bread roll";
    }

    // setters
    public void setBeanSprouts(boolean beanSprouts) {
        if (maxAdditionalItemsH() && !this.beanSprouts) {
            this.beanSprouts = true;
            this.numOfAdditionalItemsH++;
            this.finalPrice += 1.50;
        }
    }

    public void setKale(boolean kale) {
        if (maxAdditionalItems() && !this.kale) {
            this.kale = true;
            this.numOfAdditionalItemsH++;
            this.finalPrice += 1.00;
        }
    }

    // helper methods
    public boolean maxAdditionalItemsH() {
        return numOfAdditionalItemsH <= 2;
    }

    @Override
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

// I'm at a loss - requirements are not well defined. Watching video and completing this assignment via the exercise section (has better requirements).
