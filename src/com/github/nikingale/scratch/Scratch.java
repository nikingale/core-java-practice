package com.github.nikingale.scratch;

public class Scratch {
    public static void main(String[] args) {
        System.out.println("The scratch pad");

        Class1 obj1 = new Class1();
        obj1.printClass1Data();

        System.out.println();
        Class2 obj2 = new Class2();
        obj2.printClass2Data();
        System.out.println(obj2.addTwo(2, 5) );
    }
}
