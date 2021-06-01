package com.disqo.trainings.lesson9;

public class Shape {

    private String color = "red";
    private boolean isFilled = true;

    public Shape() {
        System.out.println("shape default constructor");
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        System.out.println("shape color/filled constructor");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }


    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                ']';
    }
}
