package com.company;

public class Car {
    private int year;

    public int getYear() {
        return year;
    }

    public Car(int year) {
        this.year = year;
    }
    public void beep() {
        System.out.println(year + "бииип");
    }

    public void beep(String beep) {
        System.out.println(beep);
    }

    public String getInfo() {
        return "year: " + getYear();

    }
}
