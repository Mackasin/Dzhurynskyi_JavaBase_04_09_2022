package com.hillel.dzhurynskyi.homework.hm17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        run();
    }

    static void run() {
        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        int totalPrice = 0,counter=0;
        while (true) {
            DrinksMachine drinksMachine = null;
            System.out.println("Будь ласка введіть свій напій:" + Arrays.toString(drinksMachines) + " або напишіть NO, щоб завершити процесс");
            while (true) {
                String userValue = scanner.nextLine().toUpperCase();
                if (userValue.equals("NO")) {
                    System.out.println("Загальна вартість: " + totalPrice);
                    System.out.println("Загальна кількість виготовлених напоїв: " +counter);
                    System.exit(0);
                }
                for (DrinksMachine drink : drinksMachines) {
                    if (userValue.equals(drink.toString())) {
                        drinksMachine = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else {
                    System.out.println("Wrong data");
                }
            }
            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.println("Ваш " + DrinksMachine.COFFEE.getTitle() + " готовий, його вартість " + Drinks.COFFEE);
                    totalPrice += Drinks.COFFEE;
                    counter++;
                }
                case TEE -> {
                    System.out.println("Ваш " + DrinksMachine.TEE.getTitle() + " готовий, його вартість " + Drinks.TEE);
                    totalPrice += Drinks.TEE;
                    counter++;
                }
                case LEMONADE -> {
                    System.out.println("Ваш " + DrinksMachine.LEMONADE.getTitle() + " готовий, його вартість " + Drinks.LEMONADE);
                    totalPrice += Drinks.LEMONADE;
                    counter++;
                }
                case MOJITO -> {
                    System.out.println("Ваше " + DrinksMachine.MOJITO.getTitle() + " готове, його вартість " + Drinks.MOJITO);
                    totalPrice += Drinks.MOJITO;
                    counter++;
                }
                case MINERAL_WATER -> {
                    System.out.println("Ваша " + DrinksMachine.MINERAL_WATER.getTitle() + " готова, її вартість " + Drinks.MINERAL_WATER);
                    totalPrice += Drinks.MINERAL_WATER;
                    counter++;
                }

                case COCA_COLA -> {
                    System.out.println("Ваша " + DrinksMachine.COCA_COLA.getTitle() + " готова, її вартість " + Drinks.COCA_COLA);
                    totalPrice += Drinks.COCA_COLA;
                    counter++;
                }
            }
        }

    }
}
