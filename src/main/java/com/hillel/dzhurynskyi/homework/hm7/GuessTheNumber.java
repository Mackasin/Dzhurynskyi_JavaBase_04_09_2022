package com.hillel.dzhurynskyi.homework.hm7;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("U have only 5 attempts");
        for (int i = 0; i < 5; i++) {
            int compNumb = (int) (Math.random() * 11);
            int numb;
            for (; ; ) {
                if (sc.hasNextInt()) {
                    numb = sc.nextInt();
                    if (numb >= 0 && numb <= 10)
                        break;
                    else {
                        System.out.println("Wrong data! please try again");
                        sc.nextLine();
                    }
                } else {
                    System.out.println("Wrong data! please try again");
                    sc.nextLine();
                }
            }
            if (compNumb == numb) {
                System.out.println("U win!");
                System.exit(0);
            } else if (i < 4) {
                System.out.println("Try again!");
            }

        }
        System.out.println("U lose!");

    }
}

