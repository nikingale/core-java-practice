package com.github.nikingale.java8.lambda;

import java.util.Collections;

public class GreetingLambda {
    public static void main(String[] args) {
        Greeting myGreeting = name -> System.out.println("Hello " + name);

        myGreeting.greeting("Nikhil");
    }
}
