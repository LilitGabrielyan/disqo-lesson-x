package com.disqo.trainings.Lesson1;

import com.disqo.trainings.Lesson1.MyLine;
import com.disqo.trainings.Lesson1.MyPoint;

public class Lesson1 {

    public static void main(String[] args)  {

//        Author author = new Author("dsgfds", "safv@fs,vxd");
//
//        System.out.println(author);
//
//        Book book = new Book("arwffrew", "waefaw", author, 4.5);
//        System.out.println(book);
//        book.setQty(12);
//        System.out.println(book);


        MyPoint myPoint = new MyPoint(4,3);
        System.out.println(myPoint.getDistance());
        myPoint.setX(45);

        MyLine line = new MyLine(2,2,3,3);
        System.out.println(line);
        System.out.println(line.getGradient());
        System.out.println(line.getLength());


        Ball ball = new Ball(1,2,3);
        Player player 1 = new Player(1,2,3,4);
        Player player 2 = new Player(2,2,3,4);
        Player player 3 = new Player(3,2,3,4);
        Player player 4 = new Player(4,2,3,4);

        player1.move();
        player1.kick()

    }

}





