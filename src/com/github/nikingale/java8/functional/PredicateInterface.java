package com.github.nikingale.java8.functional;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> checkIfEven = (x) -> (x % 2) == 0;

        System.out.println(checkIfEven.test(10));
    }
}
