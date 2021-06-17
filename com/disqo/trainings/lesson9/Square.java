package com.disqo.trainings.lesson9;

public class Square extends Rectangle {

    public Square() {
        System.out.println("Square default constructor");
    }

    public Square(double side) {
        super(side, side);
        System.out.println("Square side constructor");

    }

    public Square(double side, String color, boolean isFilled) {
        super(side, side, color, isFilled);
        System.out.println("Square all arguments constructor");

    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return super.getLength();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }


    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Square) {
            Square other = (Square) otherObject;
            return this.getWidth() == other.getWidth() && this.getLength() == other.getLength();
        } else {
            return false;
        }
    }
}
