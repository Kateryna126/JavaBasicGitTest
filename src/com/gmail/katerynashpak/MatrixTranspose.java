package com.gmail.katerynashpak;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int columns = scanner.nextInt();

        int[][] matrix = readMatrix(scanner, rows, columns);
        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("Original matrix: ");
        printMatrix(matrix);

        System.out.println("Transposed matrix: ");
        printMatrix(transposedMatrix);
    }

    public static int[][] readMatrix(Scanner scanner, int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

