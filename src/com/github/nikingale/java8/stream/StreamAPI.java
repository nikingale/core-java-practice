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

        List<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Shriyog");
        names.add("Shreyas");
        names.add("Ram");
        names.add("Sujay");

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

        System.out.println();
        List<String> filteredNames = names.stream().filter(s -> s.startsWith("S")).sorted().collect(Collectors.toList());
        System.out.println("Names starting with S: " + filteredNames);
    }
}
