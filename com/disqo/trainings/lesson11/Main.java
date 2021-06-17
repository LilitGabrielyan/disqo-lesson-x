package com.disqo.trainings.lesson11;


import com.disqo.trainings.lesson9.Rectangle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle(3, 4);
//        Rectangle r2 = new Rectangle(2, 4);
//        Rectangle r3 = new Rectangle(5, 4);
//        Rectangle r4 = new Rectangle(1, 1);
//        List<Rectangle> rectangles = Arrays.asList(r1, r2, r3, r4);
//        System.out.println(rectangles);
//        rectangles.sort((o1, o2) -> (int) (o1.getArea() - o2.getArea()));
//        System.out.println(rectangles);
//
        Person p1 = new Person("Hayk");
        Person p2 = new Person("Griqor");
        Person p3 = new Person("Chaxal");
        Person p4 = new Person("Aram");
        List<Person> people = Arrays.asList(p1, p2, p3, p4);
        System.out.println(people);
        people.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(people);




        /*
        homework

        each class should has its own clone method
        in main create list of MovablePoints and order them from left to right, from top to bottom
        same for MovableCircle
         */
    }
}
