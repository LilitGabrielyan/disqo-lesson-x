package com.disqo.trainings.Lesson1;

public class MyPoint {

    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    @Override
    public String toString() {
        return "(" +
                 x +
                ", " + y +
                ')';
    }
}
