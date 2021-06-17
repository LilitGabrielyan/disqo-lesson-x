package com.disqo.trainings.lesson9;

public class Rectangle extends Shape implements Comparable<Rectangle> {

    private double width = 1.0;
    private double length = 2.0;

    public Rectangle() {
        System.out.println("rectangle default constructor");

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        System.out.println("rectangle width/length constructor");

    }

    public Rectangle(double width, double length, String color, boolean isFilled) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
        System.out.println("rectangle all arguments constructor");

    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", " + super.toString() +
                '}';
    }


    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) return false;
        if (otherObject.getClass() == Rectangle.class) {
            Rectangle other = (Rectangle) otherObject;
            return super.equals(other) && this.width == other.width && this.length == other.length;
        } else {
            return false;
        }
    }


    @Override
    public int compareTo(Rectangle o) {
        return (int) (this.getArea() - o.getArea());
    }
}
