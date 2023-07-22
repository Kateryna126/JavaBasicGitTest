package com.gmail.katerynashpak;

import javax.print.attribute.standard.MediaSize;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.getX();
        this.y = otherPoint.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToPoint(Point otherPoint) {
        int deltaX = this.x - otherPoint.getX();
        int deltaY = this.y - otherPoint.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static double distanceBetweenPoints(Point point, Point otherPoint) {
        if (point == null|| otherPoint == null){
    throw new NullPointerException("One of the points is null");
        }
        return point.distanceToPoint(otherPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point otherPoint = (Point) obj;
        return this.x == otherPoint.getX() && this.y == otherPoint.getY();
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public Point clone() {
        return new Point(this.x, this.y);
    }

}