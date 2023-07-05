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

        double team1AverageAge = 0;
        double team2AverageAge = 0;

        for (int i = 0; i < 25; i++) {
            team1AverageAge += team1Ages[i];
            team2AverageAge += team2Ages[i];
        }

        team1AverageAge /= 25;
        team2AverageAge /= 25;

        System.out.println("Average age of players in Team 1: " + team1AverageAge);
        System.out.println("Average age of players in Team 2: " + team2AverageAge);
    }
}