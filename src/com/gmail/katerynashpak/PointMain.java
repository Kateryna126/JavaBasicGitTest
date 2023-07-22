package com.gmail.katerynashpak;

public class PointMain {
    public static void main(String[] args) {
        Point[] points = new Point[2];
        points[0] = new Point(5, 4);
        points[1] = points[0].clone();

        for (int i = 0; i < points.length; i++) {
            int x = points[i].getX();
            int y = points[i].getY();
            System.out.println("Point " + (i + 1) + ": (" + x + ", " + y + ")");
        }

        points[0].setCoordinates(6, 2);

        double distance = points[0].distanceToPoint(points[1]);
        double distanceStatic = Point.distanceBetweenPoints(points[0], points[1]);
        System.out.println("Distance to point 2: " + distance);
        System.out.println("Distance between points (static): " + distanceStatic);

        if (points[0].equals(points[1])) {
            System.out.println("Point 1 and point 2 are equal.");
        } else {
            System.out.println("Point 1 and point 2 are not equal.");
        }

        String pointString = points[0].toString();
        System.out.println("Point 1 as string: " + pointString);

        Point point3 = (Point)points[0].clone();
        System.out.println("Point 3: " + point3);
    }

}
