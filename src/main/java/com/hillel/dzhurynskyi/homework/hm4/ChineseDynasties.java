package com.hillel.dzhurynskyi.homework.hm4;

public class ChineseDynasties {
    public static void main(String[] args) {
        int warriorLi = 13;
        int bowmanLi = 24;
        int riderLi = 46;
        int warriorMin = 9;
        int bowmanMin = 35;
        int riderMin = 12;
        int quantityLi;
        double quantityMin;

        quantityLi = (warriorLi + bowmanLi + riderLi) * 860;
        quantityMin = (warriorMin + bowmanMin + riderMin) * (860 * 1.5);
        System.out.println("Total attack LI:" + quantityLi);
        System.out.println("Total attack MIN:" + quantityMin);
    }
}
