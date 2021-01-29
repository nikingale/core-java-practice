package com.github.nikingale.classandobject;

/**
 * @author Nikhil Ingale 30-03-2020
 */

public class TestStudent {

    public static void main(String[] args) {

        //Object Initialization through reference
        Student student1 = new Student();
        student1.setRollNo(1);
        student1.setName("Robert");
        student1.setCity("California");

        //Object Initialization through method
        Student student2 = new Student();
        student2.insertStudent(2, "David", "Dallas");

        //Object Initialization through Constructor
        Student student3 = new Student(3, "John", "New York");

        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();

    }

}