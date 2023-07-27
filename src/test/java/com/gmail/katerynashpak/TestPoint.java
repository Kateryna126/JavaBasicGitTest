package com.gmail.katerynashpak;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoint {

    @Test
    public void testDistanceToPoint() {
        Point point = new Point(0, 0);
        Point otherPoint = new Point(3, 4);
        double distance = point.distanceToPoint(otherPoint);
        assertEquals(5.0, distance, 0.001);
    }

    @Test
    public void testDistanceBetweenPoints() {
        Point point = new Point(0, 0);
        Point otherPoint = new Point(3, 4);
        double distance = Point.distanceBetweenPoints(point, otherPoint);
        assertEquals(5.0, distance, 0.001);
    }

    @Test
    public void testEqualsReflexive() {
        Point point = new Point(0, 0);
        assertTrue(point.equals(point));
    }

    @Test
    public void testHashCodeReflexive() {
        Point point1 = new Point(0, 0);
        assertEquals(point1.hashCode(), point1.hashCode());
    }

    @Test
    public void testEqualsNull() {
        Point point = new Point(0, 0);
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
}

