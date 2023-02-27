package com.program;

public class House {

    private String street;
    private int hnbr;
    private String color;
    private int sqftage;

    public House(String street, int hnbr, String color, int sqftage) {
        this.street = street;
        this.hnbr = hnbr;
        this.color = color;
        this.sqftage = sqftage;
    }

    public String setHouseStreet(String street) {
        this.street = street;
        return street;
    }

    public String getHouseStreet() {
        return street;
    }

    public Integer setHouseNbr(Integer hnbr) {
        this.hnbr = hnbr;
        return hnbr;
    }

    public Integer getHouseNbr() {
        return hnbr;
    }

    public String toString() {
        String hsname= "The house at: ";
        String sf = "sqft ";
        return hsname + hnbr + " " + street + " is " + color + " and "+ sqftage+ " "+sf;
    }



}
