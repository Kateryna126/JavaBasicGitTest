package com.gmail.katerynashpak;

public class Matrix {
    public static double average(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        if (array.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static boolean isSquare(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i] == null || matrix[i].length != rows) {
                return false;
            }
        }
        return true;
    }

}