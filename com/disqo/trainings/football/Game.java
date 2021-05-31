package com.disqo.trainings.football;

public class Game {

    public static void main(String[] args) {
        Ball ball = new Ball(0.0f, 0.0f, 0.0f);
        Player player1 = new Player(1, 0,0);
        Player player2 = new Player(2, 10,0);
        Player player3 = new Player(3, 0,10);
        Player player4 = new Player(4, 10,10);
        player1.kick(ball);
        System.out.println(player1);
        System.out.println(ball);
        player1.move(1,1);
        player1.kick(ball);
        System.out.println(player1);
        System.out.println(ball);
        player2.move(6,6);
        player2.kick(ball);
        System.out.println(player1);
        System.out.println(ball);
        System.out.println(player2);

    }
}
