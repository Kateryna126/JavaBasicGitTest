package com.gmail.katerynashpak;

public class Matrix {
    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static boolean isSquare(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i].length != matrix.length){
                return false;
            }
        }
        return true;
    }
}