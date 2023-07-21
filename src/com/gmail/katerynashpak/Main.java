package com.gmail.katerynashpak;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[2];
        points[0] = new Point(3, 4);
        points[1] = new Point(3, 4);

        int x1 = points[0].getX();
        int y1 = points[0].getY();
        int x2 = points[1].getX();
        int y2 = points[1].getY();

        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")");

        points[0].setCoordinates(5, 6);


    }

}
