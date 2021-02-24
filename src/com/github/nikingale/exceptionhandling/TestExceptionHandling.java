package com.github.nikingale.exceptionhandling;

/**
 * @author Nikhil Ingale 04-04-2020
 */

public class TestExceptionHandling {

    public static void main(String[] args) {
        ArithmeticExample arithmeticObject = new ArithmeticExample();
        arithmeticObject.divideByZero();

        System.out.println();
        NullPointerExample nullObject = new NullPointerExample();
        nullObject.nullPointer();

        System.out.println();
        IndexOutOfBoundsExample indexObject = new IndexOutOfBoundsExample();
        indexObject.indexOutOfBounds();

        System.out.println();
        FinallyExample finallyObject = new FinallyExample();
        try {
            finallyObject.numberFormat();
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println();
        ThrowAndThrows throwObject = new ThrowAndThrows();
        try {
            throwObject.validateAge(15);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println();
        ExceptionPropagation propagationObject = new ExceptionPropagation();
        propagationObject.methodA();
    }

}