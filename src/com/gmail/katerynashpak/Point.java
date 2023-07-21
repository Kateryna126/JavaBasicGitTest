package com.gmail.katerynashpak;

import javax.print.attribute.standard.MediaSize;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public static double distanceBetweenPoints(Point point1, Point point2) {
        int deltaX = point1.getX() - point2.getX();
        int deltaY = point1.getY() - point2.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public boolean equals(Object obj){
        if(this ==obj) return true;
        if (!(obj instanceof Point))return false;
        Point otherPoint = (Point) obj;
        return this.x == otherPoint.getX()&& this.y == otherPoint.getY();
    }
}