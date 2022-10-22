package com.hillel.dzhurynskyi.homework.hm18;

public class Main {
    public static double Array(int[] arr) {
        if (arr == null) return -2;
        else {
           double average = 0;
            for (int j : arr) {
                average += j;
            }
            return average /= arr.length;
        }
    }

    public static int DoubleArray(int[][] arr) {
        if (arr == null) return -2;
        else {
            for (int[] ints : arr) {
                if (ints.length == arr.length) return 1;
            }

            return 0;
        }
    }
}


