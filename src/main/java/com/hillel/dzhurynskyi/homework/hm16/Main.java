package com.hillel.dzhurynskyi.homework.hm16;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();
        System.out.println("Androids:");
        androids.call();
        androids.internet();
        androids.sms();
        androids.linuxOs();
        System.out.println("IPhones:");
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.iOS();
    }
}
