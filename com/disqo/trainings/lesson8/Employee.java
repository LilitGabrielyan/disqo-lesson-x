package com.disqo.trainings.lesson8;

public  class Employee {


    private String name;

    public Employee(String name) {
        this.name = name;
    }

    protected  void print() {
        System.out.println("super");
    }

    protected final void print(int x) {
        System.out.println("super"  + x);
    }


    private void calculate() {
        System.out.println("calculate");
    }

    public static void printStatic() {
        System.out.println("static employee call");

    }


}
