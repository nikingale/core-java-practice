package com.github.nikingale.controls;

import java.util.Scanner;

/**
 * @author Nikhil Ingale 27-03-2020
 */

public class CaseControl {

    public static void main(String[] args) {
        CaseControl control = new CaseControl();
        Scanner scan = new Scanner(System.in);
        int month;

        System.out.print("Enter month number : ");
        month = scan.nextInt();

        control.getMonthName(month);
    }

    public void getMonthName(int month) {

        switch (month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Enter valid month");
        }

    }

}