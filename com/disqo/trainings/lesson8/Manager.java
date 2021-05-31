package com.disqo.trainings.lesson8;

public class Manager extends Employee{

    private int salary;
    public Manager(String name, int salary) {
        super(name);
        this.salary = salary;
    }


    @Override
    public void print() {
        System.out.println("subclass");

        super.print();
    }

//
//    public static void printStatic() {
//        System.out.println("static manager call");
//
//    }
}
