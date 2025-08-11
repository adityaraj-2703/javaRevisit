package com.assignments.task6;

public class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    void printInfo() {
        System.out.printf("%-10s %-15d %s\n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C- Walls Street");
        Employee e2 = new Employee("Sam", 2000, "68D- Walls Street");
        Employee e3 = new Employee("John", 1999, "26B- Walls Street");

        System.out.printf("%-10s %-15s %s\n", "Name", "Year of Joining", "Address");
        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }

}
