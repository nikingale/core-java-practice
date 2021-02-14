package com.github.nikingale.aggregation;

public class TestEmployee {

    public static void main(String[] args) {

        Address address1 = new Address("Mumbai", "Maharashtra", "India");
        Address address2 = new Address("Melbourne", "Victoria", "Australia");
        Address address3 = new Address("San Francisco", "California", "USA");

        Employee employee1 = new Employee(101, "Raj", address1);
        Employee employee2 = new Employee(102, "David", address2);
        Employee employee3 = new Employee(103, "Jack", address3);

        employee1.displayEmployee();
        employee2.displayEmployee();
        employee3.displayEmployee();

    }

}