package com.gmail.katerynashpak;

public class Matrix {
    public static double average(double[] array) {
        if(array.length == 0){
            throw new IllegalArgumentException("Array must not be empty");
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static boolean isSquare(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i].length != matrix.length){
                return false;
            }
        }
        return true;
    }

    public static boolean isNull(Object object) {
        return object == null;
    }
}