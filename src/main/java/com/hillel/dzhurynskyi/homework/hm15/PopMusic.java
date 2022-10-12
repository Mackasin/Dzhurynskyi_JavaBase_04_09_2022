package com.hillel.dzhurynskyi.homework.hm15;

public class PopMusic extends MusicStyles {
    public PopMusic(String name){
        super(name);
    }
    @Override
    public void playMusic(){
        System.out.println(name+" play pop music...");
    }
}
