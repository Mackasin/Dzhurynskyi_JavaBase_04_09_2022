package com.hillel.dzhurynskyi.homework.hm15;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {
                new ClassicMusic("Beethoven"),
                new RockMusic("The Beatles"),
                new RockMusic("Rammstein"),
                new RockMusic("AC/DC"),
                new RockMusic("Måneskin"),
                new PopMusic("Eden’s Crush"),
                new PopMusic("Blaque")
        };
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
