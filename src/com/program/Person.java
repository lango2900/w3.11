package com.program;

public class Person {

    private String fname;
    private String lname;
    private int age;

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String setFName(String fname) {
        this.fname = fname;
        return fname;
    }

    public String getFName() {
        return fname;
    }

    public String setLName(String lname) {
        this.lname = lname;
        return lname;
    }

    public String getLName() {
        return lname;
    }

    public int setPAge(int age) {
        this.age = age;
        return age;
    }

    public int getPAge() {
        return age;
    }

    public String toString() {
        String psname= "Person's name: ";
        String psage= "Their age: ";
        return psname + fname + " " + lname + "\t" + psage +  age ;
    }

}








