package com.hillel.dzhurynskyi.homework.hm11;

import java.util.Arrays;
import java.util.Scanner;

public class TransposedMatrix {
    public static void main(String[] args) {
        int n, m;
        System.out.print("Enter M=");
       m = checking();
        System.out.print("Enter N=");
       n = checking();
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];
        fill(array1);
        System.out.println("BEFORE:");
        printArray(array1);
        System.out.println("AFTER:");
        transposed(array1, array2);
        printArray(array2);
    }

    private static void transposed(int[][] array, int[][] array0) {
        for (int i = 0; i < array0.length; i++) {
            for (int j = 0; j < array0[i].length; j++) {
                array0[i][j] = array[j][i];
            }
        }
    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static void fill(int[][] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++, counter++) {
            Arrays.fill(array[i], counter);
        }
    }

    private static int checking() {
        Scanner scanner = new Scanner(System.in);
        int l;
        while (true) {
            if (scanner.hasNextInt()) {
                l = scanner.nextInt();
                if (l > 0 && l <= 10) {
                    break;
                } else {
                    System.out.println("Wrong data! Please try again.");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Wrong data! Please try again.");
                scanner.nextLine();
            }
        }
        return l;
    }
}
