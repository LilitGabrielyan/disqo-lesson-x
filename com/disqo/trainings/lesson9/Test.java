package com.disqo.trainings.lesson9;

public class Test {

    public static void main(String[] args) {
        Rectangle rectangle =  new Square(5, "Green", false);
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println(rectangle);

        Shape[] shapes  = new Shape[10];
        //initialize 10 different shapes (3 circles, 3 rectangles, 4 squares)
        //using for loop print each shape perimeter ans area
        //bonus create additional getType method which will return type of shape and print
    }


}
