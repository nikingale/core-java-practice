package com.github.nikingale.abstraction;

public class Student implements Comparable<Student> {

    String name;
    int rollNo;
    int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public int compareTo(Student stud) {
        if(rollNo == stud.rollNo)
            return 0;
        else if (rollNo < stud.rollNo) {
            return -1;
        }
        else return 1;
    }
}
