package com.github.nikingale.aggregation;

public class TestEmployee {

    public static void main(String[] args) {

        Address address1 = new Address("Mumbai", "Maharashtra", "India");
        Address address2 = new Address("Bangalore", "Karnataka", "India");
        Address address3 = new Address("Sangli", "Maharashtra", "India");

        Employee employee1 = new Employee(21, "Nikhil", address1);
        Employee employee2 = new Employee(22, "Shriyog", address2);
        Employee employee3 = new Employee(23, "Shreyas", address3);

        employee1.displayEmployee();
        employee2.displayEmployee();
        employee3.displayEmployee();
    }
}