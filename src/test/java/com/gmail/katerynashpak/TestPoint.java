package com.gmail.katerynashpak;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPoint {

    private static Point point;
    private static final double DELTA = 0.001;

    @BeforeAll
    public static void setUp(){
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
       
        Point otherPoint = new Point(1, 1);
        
        assertFalse(point.equals(otherPoint));
    }

    @Test
    public void testEqualsSymmetric() {
        
        Point otherPoint = new Point(0, 0);

        assertEquals(point,otherPoint);
        assertEquals(otherPoint,point);
    }



    @Test
    public void testHashCodeSymmetric() {

        Point otherPoint = new Point(0, 0);

        assertEquals(point.hashCode(), otherPoint.hashCode());
    }

    @Test
    public void testClone() {

        Point otherPoint = point.clone();

        assertEquals(point,otherPoint);
    }

    @Test
    public void testEqualsTransitive(){

        Point otherPoint = new Point(0,0);
        Point anotherPoint = new Point(0,0);

        assertEquals(point, otherPoint);
        assertEquals(otherPoint, anotherPoint);
        assertEquals(point, anotherPoint);
    }
}

