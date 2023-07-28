package com.gmail.katerynashpak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {
    @Test
    public void testAverage() {

        double[] array = {1, 2, 3, 4};

        double result = Matrix.average(array);

        assertEquals(2.5, result, 0.0);
    }

    @Test
    public void testIsSquare() {

        int[][] squareMatrix = {{1, 2}, {3, 4}};

        assertTrue(Matrix.isSquare(squareMatrix));
    }
    @Test
    public void testNotSquare() {

        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};

        assertFalse(Matrix.isSquare(nonSquareMatrix));
    }

    @Test
    public void testAverageFromEmptyArray() {

        double[] array = {};

        double result = Matrix.average(array);

        assertEquals(0.0, result, 0.0);

    }

    @Test
    public void testIsSquareFromEmptyMatrix() {

        int[][] matrix = {};


    }

    @Test
    public void testIsSquareFromMatrixWithEmptyRow() {

        int[][] matrix = {{1, 2}, {}};


    }

    @Test
    public void testIsSquareFromMatrixWithNullRow() {

        int[][] matrix = {{1, 2}, null};



    }

    @Test
    public void testAverageFromNull() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> Matrix.average(null));
    }

    @Test
    public void testIsSquareFromNull() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> Matrix.isSquare(null));
    }
}
