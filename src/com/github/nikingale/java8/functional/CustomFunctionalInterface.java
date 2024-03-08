package com.github.nikingale.java8.functional;

public interface CustomFunctionalInterface<Integer> {
    int add(int a);

    default void normalFunction()
    {
        System.out.println("Hello");
    }
}
