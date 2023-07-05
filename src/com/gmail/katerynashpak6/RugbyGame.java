package com.gmail.katerynashpak6;

import java.util.Random;

public class RugbyGame {
    public static void main(String[] args) {
        int[] allBlacksAges = new int[20];
        int[] wallabiesAges = new int[32];

        fillArrayWithRandomNumbers(allBlacksAges, 18, 40);
        fillArrayWithRandomNumbers(wallabiesAges, 18, 40);

        printTeamAges(allBlacksAges, "All Blacks");
        System.out.println("\n");

        printTeamAges(wallabiesAges, "Wallabies");
        System.out.println("\n");
    }

    public static void fillArrayWithRandomNumbers(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }
    public static void printTeamAges(int[] teamAges, String teamName) {
        System.out.println("Ages of players in " + teamName + ":");
        for (int age : teamAges) {
            System.out.print(age + " ");
        }
    }
}
