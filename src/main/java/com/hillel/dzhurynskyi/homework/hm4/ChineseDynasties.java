package com.hillel.dzhurynskyi.homework.hm4;

public class ChineseDynasties {
    public static void main(String[] args) {
        int warriorLi = 13;
        int bowmanLi = 24;
        int riderLi = 46;
        int warriorMin = 9;
        int bowmanMin = 35;
        int riderMin = 12;
        int total = 860;
        double number = 1.5;
        int quantityLi;
        double quantityMin;

        quantityLi = (warriorLi + bowmanLi + riderLi) * total;
        quantityMin = (warriorMin + bowmanMin + riderMin) * (total * number);
        System.out.println("Total attack LI:" + quantityLi);
        System.out.println("Total attack MIN:" + quantityMin);
    }
}
