package com.gmail.katerynashpak;

public class MusicMain {
    public static void main(String[] args) {
        MusicStyles[] bands = new MusicStyles[]{
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()};

        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}
