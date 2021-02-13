package com.github.nikingale.aggregation;

public class Employee {

    private int employeeID;
    private String employeeName;
    Address address;

    public Employee(int employeeID, String employeeName, Address address) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.address = address;
    }

    void displayEmployee() {

        System.out.println("\nEmployee ID - " + employeeID + "\nEmployee Name - " + employeeName);
        System.out.println("Employee Address(City, State, Country) - " + address.city + " " + address.state + " " + address.country);
    }

}