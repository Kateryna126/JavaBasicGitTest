package com.gmail.katerynashpak;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SteppedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();
        System.out.print("Enter the maximum number of elements in a row: ");
        int maxElementsInRow = scanner.nextInt();
        int[][] array = createArray(numberOfRows, maxElementsInRow);
        printArray(array);
    }

    public static int[][] createArray(int numberOfRows, int maxElementsInRow) {
        Random random = new Random();
        int[][] array = new int[numberOfRows][];
        for (int i = 0; i < numberOfRows; i++) {
            int actualElementsInRow = random.nextInt(maxElementsInRow);
            array[i] = new int[actualElementsInRow];
            for (int j = 0; j < actualElementsInRow; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}

