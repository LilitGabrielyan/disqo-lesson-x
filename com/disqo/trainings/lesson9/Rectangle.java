package com.disqo.trainings.lesson9;

public class Rectangle extends Shape {

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
}
