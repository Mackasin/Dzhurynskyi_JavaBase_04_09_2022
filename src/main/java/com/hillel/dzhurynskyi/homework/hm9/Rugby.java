package com.hillel.dzhurynskyi.homework.hm9;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        double counter1 = 0, counter2 = 0;
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 23 + 18);
            counter1 += team1[i];
            team2[i] = (int) (Math.random() * 23 + 18);
            counter2 += team2[i];
        }
        System.out.println("Team 1:\n" + Arrays.toString(team1) + "\nTeam 2:\n" + Arrays.toString(team2));
        counter1 /= 25;
        counter2 /= 25;
        System.out.println("Average age of the team 1:\n" + counter1 + "\nAverage age of the team 2:\n" + counter2);
    }
}
