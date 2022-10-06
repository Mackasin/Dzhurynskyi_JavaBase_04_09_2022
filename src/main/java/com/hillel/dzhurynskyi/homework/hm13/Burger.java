package com.hillel.dzhurynskyi.homework.hm13;

public class Burger {
    public Burger(String meat, String mayonnaise, String roll, String cheese, String green) {
        this.meat = meat;
        this.mayonnaise = mayonnaise;
        this.roll = roll;
        this.cheese = cheese;
        this.green = green;
    }

    public Burger(String meat, String roll, String cheese, String green) {
        this.meat = meat;
        this.roll = roll;
        this.cheese = cheese;
        this.green = green;
    }

    public Burger(String meat, String mayonnaise, String roll, String cheese, String green, String secondMeat) {
        this.meat = meat;
        this.mayonnaise = mayonnaise;
        this.roll = roll;
        this.cheese = cheese;
        this.green = green;
        this.secondMeat=secondMeat;

    }

    @Override
    public String toString() {
        return "Burger{" +
                "meat='" + meat + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                ", roll='" + roll + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                ", secondMeat='" + secondMeat + '\'' +
                '}';
    }

    String meat;
    String mayonnaise;
    String roll;
    String cheese;
    String green;
    String secondMeat;
}
