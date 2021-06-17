package com.disqo.trainings.lesson11;

import java.util.Date;

interface Workable {

    String x = "asfda";
    void work();

   default void paySalary(int amount) {
       System.out.println("wow");
   }
}

interface Markup {

}

interface Runnable {
    void run();

}

interface Movable {

    void moveLeft();

    void moveRight();
}


class Person implements Workable, Runnable, Cloneable {

    private String name;
    private Date dob = new Date();

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("I'm working");
    }

    @Override
    public void run() {
        System.out.println("I'm running");

    }

    @Override
    public void paySalary(int amount) {
        System.out.println("wow salary");
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = new Person(this.name);
        p.dob = (Date)this.dob.clone();
        return p;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}


class Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm running animal");
    }
}



interface A {

    default void print() {
        System.out.println("A implementation");
    }
}

interface B {

    default void print() {
        System.out.println("B implementation");
    }
}

class C implements A,B {

    @Override
    public void print() {
       A.super.print();
       B.super.print();
    }
}
