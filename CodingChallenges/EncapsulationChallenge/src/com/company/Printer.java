package com.company;

public class Printer {
    // instance variables
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    // constructor
    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.duplexPrinter = duplexPrinter;
    }

    // setter
    public void setTonerLevel(int tonerLevel) {
        System.out.println("adding " + tonerLevel);
        if (this.tonerLevel + tonerLevel >= 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += tonerLevel;
        }
        System.out.println("Toner level now " + this.tonerLevel);
    }

    public void printPages(int pagesToPrint) {
        System.out.println("Printing " + pagesToPrint + " pages");
        this.pagesPrinted += pagesToPrint;
        System.out.println(this.pagesPrinted + " pages printed");
    }

    public void isDuplexPrinter() {
        if (this.duplexPrinter) {
            System.out.println("Is a duplex printer");
        } else {
            System.out.println("Is NOT a duplex printer");
        }
    }
}
