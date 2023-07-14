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
        sortArray(array);
        System.out.println("Sorted array:");
        printArray(array);
        System.out.println("Sum of all elements: " + sumArray(array));
        System.out.println("Minimum element for each row: " + Arrays.toString(minRowElements(array)));
        int minElement = minElement(array);
        System.out.println("Minimum element among all elements: " + minElement);
        if (minElement != 0) {
            divideArray(array, minElement);
            System.out.println("Array after division by absolute minimum:");
            printArray(array);
        } else {
            System.out.println("Division by absolute minimum is not possible");
        }
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

    public static void sortArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                Arrays.sort(array[i]);
            } else {
                Arrays.sort(array[i]);
                for (int j = 0; j < array[i].length / 2; j++) {
                    int temp = array[i][j];
                    array[i][j] = array[i][array[i].length - j - 1];
                    array[i][array[i].length - j - 1] = temp;
                }
            }
        }
    }

    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    public static int[] minRowElements(int[][] array) {
        int[] minElements = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            minElements[i] = Integer.MAX_VALUE;
            for (int element : array[i]) {
                if (element < minElements[i]) {
                    minElements[i] = element;
                }
            }
        }
        return minElements;
    }

    public static int minElement(int[][] array) {
        int minElement = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (element < minElement) {
                    minElement = element;
                }
            }
        }
        return minElement;
    }

    public static void divideArray(int[][] array, int divisor) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % divisor == 0) {
                    array[i][j] /= divisor;
                } else {
                    System.out.println("Operation is not possible");
                    return;
                }
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}

