package com.gmail.katerynashpak;

import java.util.Arrays;
import java.util.Random;

public class LotteryGame {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateRandomNumbers(7);
        int[] playerNumbers = generateRandomNumbers(7);

        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumbers);

        System.out.println(Arrays.toString(lotteryNumbers));
        System.out.println(Arrays.toString(playerNumbers));

        int numMatches = countMatches(lotteryNumbers, playerNumbers);
        System.out.println("Number of matches: " + numMatches);
    }

    public static int[] generateRandomNumbers(int length) {
        int[] numbers = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(10);
        }

        return numbers;
    }
    public static int countMatches(int[] firstArray, int[] secondArray) {
        int count = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                count++;
            }
        }

        return count;
    }
}