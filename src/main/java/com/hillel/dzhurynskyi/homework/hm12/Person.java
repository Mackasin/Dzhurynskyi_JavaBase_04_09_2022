package com.hillel.dzhurynskyi.homework.hm12;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will","Smith","New York","2936729462846"));
        System.out.println(personInfo("Jackie","Chan","Shanghai","12312412412"));
        System.out.println(personInfo("Sherlock","Holmes","London","37742123513"));
    }
    public static String personInfo(String name, String surname, String city, String phoneNumber){

      String str= "Зателефонувати громадянинові "+name+" "+surname+ " з міста "+city+" можна за номером "+phoneNumber;
        return  str;
    }

}
