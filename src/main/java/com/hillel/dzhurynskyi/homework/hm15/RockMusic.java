package com.hillel.dzhurynskyi.homework.hm15;

public class RockMusic extends MusicStyles{
    public RockMusic(String name){
        super(name);
    }
    @Override
    public void playMusic(){
        System.out.println(name+" play rock music...");
    }
}
