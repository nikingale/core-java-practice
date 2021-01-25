package com.github.nikingale.classandobject;

public class TestEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Robert", 25000f);
        Employee e2 = new Employee(200, "David", 50000f);
        Employee e3 = new Employee(300, "John", 100000f);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }

}