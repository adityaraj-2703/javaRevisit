package com.assignments.task6;

public class Student {
    String name;
    int enrollmentNo;

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Amay";
        s.enrollmentNo = 132;

        System.out.println("Student Name: " + s.name);
        System.out.println("Enrollment No: " + s.enrollmentNo);
    }

}
