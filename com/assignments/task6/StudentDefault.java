package com.assignments.task6;

public class StudentDefault {
    String name;

    
    StudentDefault() {
        this.name = "Unknown";
    }

    
    StudentDefault(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        StudentDefault s1 = new StudentDefault("Amit");
        StudentDefault s2 = new StudentDefault();

        s1.printName(); 
        s2.printName(); 
    }

}
