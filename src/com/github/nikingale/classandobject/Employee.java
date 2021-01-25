package com.github.nikingale.classandobject;

/**
 * @author Nikhil Ingale 30-03-2020
 */

public class Employee {

    private int id;
    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("Employee ID : " + this.id + "\nEmployee Name : " + this.name + "\nEmployee Salary : ₹" + this.salary);
    }

}