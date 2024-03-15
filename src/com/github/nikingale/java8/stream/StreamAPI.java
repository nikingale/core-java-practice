package com.github.nikingale.java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        Stream<Integer> myStream = Stream.of(1, 2, 3);
        myStream.forEach(System.out::println);

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
        names.add("Ram");

        System.out.println("Printing the collection : " + numbers);

        System.out.println();
        List<Integer> result = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even number stream list : " + result);

        List<Integer> mapResult = numbers.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println("Map result (number + 10) : " + mapResult);

        List<Integer> sortedResult = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted numbers result : " + sortedResult);

        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        System.out.println("Max number is : " + maxNumber);

        System.out.println();
        System.out.println("Printing the collection : " + names);

        System.out.println();
        List<String> filteredNames = names.stream().filter(s -> s.startsWith("S")).sorted().collect(Collectors.toList());
        System.out.println("List of names starting with S: " + filteredNames);

        String filteredNamesString = names.stream().filter(s -> s.startsWith("S")).sorted().collect(Collectors.joining("-"));
        System.out.println("FilteredNamesString : " + filteredNamesString);

        List<Integer> mappedStream = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Names length: " + mappedStream);

        List<String> distinctNames = names.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Names: " + distinctNames);
    }
}
