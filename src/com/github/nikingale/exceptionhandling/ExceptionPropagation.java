package com.github.nikingale.exceptionhandling;

/**
 * @author Nikhil Ingale 04-04-2020
 */

public class ExceptionPropagation {

    public void methodC() throws Exception {
        throw new Exception("exception at methodC()");
    }

    public void methodB() throws Exception {
        methodC();
    }

    public void methodA() {
        try {
            methodB();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}