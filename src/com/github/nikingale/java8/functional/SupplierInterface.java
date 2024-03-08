package com.github.nikingale.java8.functional;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Double> randomNumberSupplier = () -> Math.random();

        System.out.println("Random NuNumber : " + randomNumberSupplier.get());
    }
}
