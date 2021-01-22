package com.github.nikingale.controls;

import java.util.Scanner;

/**
 * @author Nikhil Ingale 27-03-2020
 */

public class ConditionControl {

    public static void main(String[] args) {
        ConditionControl result = new ConditionControl();
        Scanner scan = new Scanner(System.in);
        int marks = 0;

        System.out.print("Enter Marks Obtained : ");
        marks = scan.nextInt();

        result.checkPassOrFail(marks);
        result.checkFullMarks(marks);
        result.checkGradeObtained(marks);
    }

    public void checkFullMarks(int marks) {
        if (marks == 100) {
            System.out.println("Full Marks Obtained");
        }
    }

    public void checkPassOrFail(int marks) {
        if (marks < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
    }

    public void checkGradeObtained(int marks) {
        if (marks < 35) {
            System.out.println("Grade - F");
        } else if (marks >= 35 && marks < 40) {
            System.out.println("Grade - D");
        } else if (marks >= 40 && marks < 60) {
            System.out.println("Grade - C");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("Grade - B");
        } else {
            System.out.println("Grade - A");
        }
    }

}