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
        System.out.println("Ages of players in Team 1:");
        for (int age : team1Ages) {
            System.out.print(age + " ");
        }
        System.out.println("\n");

        System.out.println("Ages of players in Team 2:");
        for (int age : team2Ages) {
            System.out.print(age + " ");
        }
        System.out.println("\n");
    }
}