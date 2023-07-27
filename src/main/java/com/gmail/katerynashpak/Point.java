package com.gmail.katerynashpak;

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
        if (otherPoint == null) {
            throw new IllegalArgumentException("One of the points is null");
        }
        int dx = this.x - otherPoint.x;
        int dy = this.y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distanceBetweenPoints(Point point, Point otherPoint) {
        if (point == null || otherPoint == null) {
            throw new IllegalArgumentException("One of the points is null");
        }
        return point.distanceToPoint(otherPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}  