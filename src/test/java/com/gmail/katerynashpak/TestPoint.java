package com.gmail.katerynashpak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPoint {

    private Point point;
    private static final double DELTA = 0.001;

    @BeforeAll
    public void setUp(){
        point = new Point(0,0);
    }

    @Test
    public void testDistanceToPoint() {

        Point otherPoint = new Point(3, 4);

        double distance = point.distanceToPoint(otherPoint);

        assertEquals(5.0, distance, DELTA);
    }

    @Test
    public void testDistanceBetweenPoints() {

        Point otherPoint = new Point(3, 4);

        double distance = Point.distanceBetweenPoints(point, otherPoint);

        assertEquals(5.0, distance, DELTA);
    }

    @Test
    public void testEqualsNull() {

        assertFalse(point.equals(null));
    }

    @Test
    public void testEqualsDifferentPoints() {
        Point point = new Point(0, 0);
        Point otherPoint = new Point(1, 1);
        assertFalse(point.equals(otherPoint));
    }

    @Test
    public void testEqualsSymmetric() {
        Point point = new Point(0, 0);
        Point otherPoint = new Point(0, 0);
        assertTrue(point.equals(otherPoint));
        assertTrue(otherPoint.equals(point));
    }

    @Test
    public void testHashCodeSymmetric() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        assertEquals(point1.hashCode(), point2.hashCode());
    }

    @Test
    public void testClone() {
        Point point1 = new Point(0, 0);
        Point point2 = point1.clone();
        assertTrue(point1.equals(point2));
    }
}

