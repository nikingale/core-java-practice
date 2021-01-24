package com.github.nikingale.typecasting;

public class ObjectAndString {

    public static void main(String[] args) {
        System.out.println("String to Object-");
        String string = "Hello";
        Object object = string;
        System.out.println("String : " + string);
        System.out.println("Object : " + object);

        System.out.println("\nObject to String-");
        object = "Hello again";
        string = object.toString();
        System.out.println("Object : " + object);
        System.out.println("String : " + string);
    }

}