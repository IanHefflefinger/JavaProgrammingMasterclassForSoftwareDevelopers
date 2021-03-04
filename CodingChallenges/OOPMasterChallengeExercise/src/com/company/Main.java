package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("regular", "beef", 6);
        hamburger.setName("Ian's burger");
//        hamburger.showPrice();
        hamburger.setLettuce(true);
        hamburger.setOnion(true);
        hamburger.setPickle(true);
        hamburger.setTomato(true);
        hamburger.showPrice();
    }
}
