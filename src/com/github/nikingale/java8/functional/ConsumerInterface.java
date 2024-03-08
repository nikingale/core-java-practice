package com.github.nikingale.java8.functional;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> greeting = (String name) -> System.out.println("Hello " + name);

        String name = "Nikhil";
        greeting.accept(name);
    }
}
