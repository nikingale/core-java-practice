package com.github.nikingale.aggregation;

public class Employee {

    private int employeeID;
    private String employeeName;
    Address address;

    public Employee() {
    }

    public Employee(int employeeID, String employeeName, Address address) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.address = address;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayEmployee() {

        System.out.println("\nEmployee ID - " + employeeID + "\nEmployee Name - " + employeeName);
        System.out.println("Employee Address - " + address.city + " " + address.state + " " + address.country);
    }

}