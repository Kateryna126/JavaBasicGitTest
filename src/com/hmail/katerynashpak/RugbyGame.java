package com.hmail.katerynashpak;

import java.util.Random;

public class RugbyGame {
    public static void main(String[] args) {
        int[] team1Ages = new int[25];
        int[] team2Ages = new int[25];
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            team1Ages[i] = random.nextInt(23) + 18;
            team2Ages[i] = random.nextInt(23) + 18;
        }
    }
}