package com.hillel.dzhurynskyi.homework.hm15;

public class ClassicMusic extends MusicStyles{
    public ClassicMusic(String name){
        super(name);
    }
    @Override
    public void playMusic(){
        System.out.println(name+" play classic music...");
    }
}
