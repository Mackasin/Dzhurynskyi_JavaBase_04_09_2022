package com.hillel.dzhurynskyi.homework.hm16;

public class IPhones implements Smartphones,IOS{
    @Override
    public void call() {
        System.out.println("IPhones can call");
    }

    @Override
    public void sms() {
        System.out.println("IPhones can sent sms");
    }

    @Override
    public void internet() {
        System.out.println("IPhones can go to internet");
    }

    @Override
    public void iOS() {
        System.out.println("IPhones uses IOS");
    }
}
