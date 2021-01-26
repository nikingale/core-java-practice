package com.github.nikingale.classandobject;

/**
 * @author Nikhil Ingale 30-03-2020
 */

public class Rectangle {

    private float length;
    private float breadth;

    public Rectangle() {
    }

    public Rectangle(float length, float breadth) {
        setLength(length);
        setBreadth(breadth);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("Area is " + (getLength() * getBreadth()) + " sq units");
    }

}