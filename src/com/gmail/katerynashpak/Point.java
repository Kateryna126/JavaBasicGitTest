package com.gmail.katerynashpak;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

}