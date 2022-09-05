package com.hillel.dzhurynskyi.homework.hm3;

public class Parallelepiped {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = 8;
        int volume;
        volume = a * b * c;
        int length = 4 * a + 4 * c + 4 * b;
        System.out.println("Об'єм паралелепіпеда = " + volume + " см");
        System.out.println("Периметр паралелепіпеда = " + length + " см");
    }
}
