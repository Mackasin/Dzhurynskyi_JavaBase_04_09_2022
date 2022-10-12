package com.hillel.dzhurynskyi.homework.hm15;

public abstract class MusicStyles {
    String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    public abstract void playMusic();
}
