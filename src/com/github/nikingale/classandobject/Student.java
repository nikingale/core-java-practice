package com.github.nikingale.classandobject;

/**
 * @author Nikhil Ingale 30-03-2020
 */

public class Student {

    private int rollNo;
    private String name;
    private String city;

    public Student() {
    }

    public Student(int rollNo, String name, String city) {
        setRollNo(rollNo);
        setName(name);
        setCity(city);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void insertStudent(int rollNo, String name, String city) {
        setRollNo(rollNo);
        setName(name);
        setCity(city);
    }

    public void displayStudent() {
        System.out.println("Roll No : " + this.rollNo + "\nName : " + this.name + "\nCity : " + this.city);
    }

}