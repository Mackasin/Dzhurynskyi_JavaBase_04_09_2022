package com.hillel.dzhurynskyi.homework.hm13;

public class Main {
    public static void main(String[] args) {
        Burger first=new Burger("Meat","mayonnaise","roll","cheese","green");
        Burger second=new Burger("Meat","roll","cheese","green");
        Burger third=new Burger("Meat","mayonnaise","roll","cheese","green","Second meat" );
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
