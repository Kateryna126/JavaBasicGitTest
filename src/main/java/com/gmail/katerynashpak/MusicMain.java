package com.gmail.katerynashpak;

public class MusicMain {
    public static void main(String[] args) {
        MusicStyles[] bands = {new MusicStyles.PopMusic(), new MusicStyles.RockMusic(), new MusicStyles.ClassicMusic()};
        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}
