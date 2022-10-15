package com.hillel.dzhurynskyi.homework.hm16;

public class Androids implements Smartphones,LinuxOS{

    @Override
    public void call() {
        System.out.println("Android can call");
    }

    @Override
    public void sms() {
        System.out.println("Android can sent sms");
    }

    @Override
    public void internet() {
        System.out.println("Android can go to internet");
    }

    @Override
    public void linuxOs() {
        System.out.println("Android uses LinuxOS");

    }
}
