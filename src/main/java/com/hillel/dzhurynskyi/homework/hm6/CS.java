package com.hillel.dzhurynskyi.homework.hm6;

import java.util.Scanner;

public class CS {
    public static void main(String[] args) {
        int number=0;
        double result1=0,result2=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Team 1:");
        String team1=sc.nextLine();
        for(int i=0;i<5;i++){
            System.out.println("Player"+(++number));
            if (sc.hasNextInt()) {
                int pl=sc.nextInt();
                result1+=pl;
            } else {
                System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
                System.exit(0);
            }
        }
        result1/=5;
        number=0;
        System.out.print("Team 2:");
        String team2=sc.next();
        for(int i=0;i<5;i++){
            System.out.println("Player"+(++number));
            if (sc.hasNextInt()) {
               int pl=sc.nextInt();
                result2+=pl;
            } else {
                System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
                System.exit(0);
            }
        }
        result2/=5;
        if(result1>result2)
            System.out.println(team1+" win! In result has "+result1+" points.");
        else if(result1<result2)
            System.out.println(team2+" win! In result has "+result2+" points.");
        else System.out.println("Draw! They have "+result1+" points.");
    }
}
