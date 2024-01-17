package com.github.nikingale.abstraction;

import java.util.*;
public class TestStudent {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Shriyog", 3, 28));
        studentList.add(new Student("Ram", 2, 26));
        studentList.add(new Student("Nikhil", 1, 25));

        System.out.println("Before Comaparable sorting-");
        for (Student st:studentList) {
            System.out.println(st.name + " " + st.rollNo+ " " + st.age);
        }

        Collections.sort(studentList);

        //Using anonymous class
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.rollNo == o2.rollNo)
                    return 0;
                else if (o1.rollNo < o2.rollNo) {
                    return -1;
                }
                else return 1;
            }
        });

        System.out.println("-------------------------------------------");
        System.out.println("After Comaparable sorting-");
        for (Student st:studentList) {
            System.out.println(st.name + " " + st.rollNo+ " " + st.age);
        }

        System.out.println("-------------------------------------------");

        //Lambda Expression
        studentList.forEach(student -> System.out.println(student.name));
    }
}
