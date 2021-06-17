package com.disqo.trainings.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoException {

    /**
     * divides a to b
     * @param a
     * @param b
     * @return
     * @throws IllegalArgumentException when b is 0
     */
    public int divide(int a, int b) throws MyCustomException {
        if(b == 0) {

            throw new MyCustomException("b is 0, please provide another number");
        }

        return a/b;

    }

    public int sum(int a, int b) throws FileNotFoundException{
        if(b == 0) {

            throw new FileNotFoundException("b is 0, please provide another number");
        }

        return a/b;

    }


    public int sum2(int a, int b  ){
        try {
            return sum(a, b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
