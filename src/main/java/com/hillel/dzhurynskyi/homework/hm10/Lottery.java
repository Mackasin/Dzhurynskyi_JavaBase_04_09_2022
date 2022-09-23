package com.hillel.dzhurynskyi.homework.hm10;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        Lottery program = new Lottery();
        program.run();
    }

    private void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void filling(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void matches(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                counter++;
            }
        }
        System.out.println("Number of matches: " + counter);
    }

    private void run() {
        int[] first = new int[7];
        int[] second = new int[7];
        filling(first);
        filling(second);
        System.out.println("To sort array 1:");
        print(first);
        System.out.println("To sort array 2:");
        print(second);
        sort(first);
        sort(second);
        System.out.println("After sorting array 1:");
        print(first);
        System.out.println("After sorting array 2:");
        print(second);
        matches(first, second);
    }


}
