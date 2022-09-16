package com.hillel.dzhurynskyi.homework.hm8;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int count = 1;
        for (int s = 1; ;s++) {
            if(count==101){
                System.exit(0);
            }
            System.out.print("shuttle " + count + ": ");
            int  i=s;
while( i>0) {
    if ((i / 10 == 4) || (i % 10 == 4) || (i / 10 == 9) || (i % 10 == 9)) {
s++;
        i=s;
    }
    else  i/=10;
}
            System.out.println(s+"\n");
count++;
        }
    }
}

