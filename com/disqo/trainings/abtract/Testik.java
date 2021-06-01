package com.disqo.trainings.abtract;


public class Testik {

    public static void main(String[] args) {
        Epmloyee e = new Manager();
        Epmloyee a = new Accounter();
        raiseSalary(e);
        raiseSalary(a);
    }


    static void raiseSalary(Epmloyee e) {
        e.setSalary(e.getSalary() * 2);
    }
}
