package com.gmail.katerynashpak6;

import java.util.Random;

public class RugbyGame {
    public static void main(String[] args) {
        int[] allBlacksAges = new int[20];
        int[] wallabiesAges = new int[32];

        fillArrayWithRandomNumbers(allBlacksAges, 18, 40);
        fillArrayWithRandomNumbers(wallabiesAges, 18, 40);
    }

    public static void fillArrayWithRandomNumbers(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }
}
