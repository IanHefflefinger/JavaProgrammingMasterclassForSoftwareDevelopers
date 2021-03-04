package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, false);
	    printer.setTonerLevel(14);
	    printer.printPages(3);
	    printer.isDuplexPrinter();
    }
}
