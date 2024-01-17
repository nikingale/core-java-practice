package com.github.nikingale.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(16);
        numbers.add(8);
        numbers.add(20);

        System.out.println("Printing the collection : " + numbers);

        System.out.println();
        List<Integer> result = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Printing the even number stream list : " + result);

        System.out.println();
        List<Integer> mapResult = numbers.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println("Map result : " + mapResult);

        System.out.println();
        List<Integer> sortedResult = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Result : " + sortedResult);
    }
}
