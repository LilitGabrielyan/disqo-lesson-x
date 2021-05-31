package com.disqo.trainings.football;

public class Player {

    private float x, y;
    private float z = 0.0f;
    private int number;

    public Player( int number, float x, float y) {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    public void move(float xDisp, float yDisp) {
        this.x = xDisp;
        this.y = yDisp;
    }

    public void jump(float zDisp) {
        this.z = zDisp;
    }

    public boolean near(Ball ball) {
        return Math.sqrt(Math.pow(ball.getX() - x, 2) +  Math.pow(ball.getY() - y, 2) +  Math.pow(ball.getZ() - z, 2)) < 8;
    }

    public void kick(Ball ball) {

        if(near(ball)) {
            ball.setXYZ(1 + 3 * ball.getX(), 1 + 3 * ball.getY(), 0);
        }
        else {
            move(ball.getX(), ball.getY());
        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", number=" + number +
                '}';
    }
}
