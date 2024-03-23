package com.github.nikingale.java8.lambda;

import java.util.*;
public class LambdaExpression {
    public static void main(String[] args) {
        //Example1
        Operation addition = (a, b) -> a + b;
        System.out.println(addition.operate(2,3));

        //Example2
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        myList.forEach(number -> {
            if (number % 2 == 0) System.out.println(number);
        });

        //Example3
        List<String> names = new ArrayList<>();
        names.add("Shriyog");
        names.add("Ram");
        names.add("Shreyas");

        names.forEach(name -> System.out.println("Hello " + name));
    }
}
