package com.gmail.katerynashpak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoint {

    @Test
    public void testDistanceToPoint() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        double distance = point1.distanceToPoint(point2);
        assertEquals(5.0, distance, 0.001);
    }
}

