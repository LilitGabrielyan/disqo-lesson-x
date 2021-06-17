package com.disqo.trainings.inner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Outer.SomeInterface someInterface = new Outer.SomeInterface() {
            @Override
            public void print() {
            }
            @Override
            public void sayHello() {
            }
        };
        someInterface.print();
        Person person = new Person() {
            @Override
            public String getName() {
                return "sub class";
            }
        };
        Person person1 =  new Person("sf", 45) {
            @Override
            public String getName() {
                return "sub class2";
            }
        };


        System.out.println(person.getClass());
        System.out.println(person1.getClass());
    }
}
