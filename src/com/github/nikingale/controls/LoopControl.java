package com.github.nikingale.controls;

import java.util.Scanner;

/**
 * @author Nikhil Ingale 27-03-2020
 */

public class LoopControl {

    public static void main(String[] args) {
        LoopControl loop = new LoopControl();
        Scanner scan = new Scanner(System.in);
        int target;

        System.out.print("Enter target repetition: ");
        target = scan.nextInt();
        loop.forLoop(target);
        loop.whileLoop(target);
        loop.doWhileLoop(target);
    }

    public void forLoop(int target) {
        System.out.println("\nRepeating for-loop for " + target + " times");
        for (int i = 0; i < target; i++) {
            System.out.println("Hello for-loop");
        }
    }

    public void whileLoop(int target) {
        System.out.println("\nRepeating while-loop for " + target + " times");
        int i = 0;
        while (i < target) {
            System.out.println("Hello while-loop");
            i++;
        }
    }

    public void doWhileLoop(int target) {
        System.out.println("\nRepeating do-while-loop for " + target + " times");
        int i = 0;
        do {
            System.out.println("Hello do-while-loop");
            i++;
        } while (i < target);
    }

}