package com.gmail.katerynashpak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
    @Test
    public void testAverage() {
        double[] array = {1, 2, 3, 4};
        double result = Matrix.average(array);
        assertEquals(2.5,result,0.0);

    }

}
