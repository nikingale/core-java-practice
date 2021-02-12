package com.github.nikingale.encapsulation;

/**
 * @author Nikhil Ingale 03-04-2020
 */

public class GoodDog {

    private int size;

    public GoodDog() {
        this.size = 1;
    }

    public GoodDog(int size) {
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
        else this.size = 1;
    }

    public void bark() {
        if (this.getSize() > 50) {
            System.out.println("Woof! Woof!");
        }
        else if (this.getSize() > 10) {
            System.out.println("Ruff! Ruff!");
        }
        else {
            System.out.println("Yip! Yip!");
        }
    }

}