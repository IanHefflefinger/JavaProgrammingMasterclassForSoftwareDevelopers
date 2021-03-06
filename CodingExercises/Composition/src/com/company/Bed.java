package com.company;

public class Bed {
    // instance variables
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    // constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    // instance methods
    public void make() {
        System.out.println("Bed -> Making bed");
    }

    // getters
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
