package com.assignments.task6;

public class Rectangle {
    double length;
    double breadth;

    // Constructor with no parameters
    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Constructor with two parameters
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor with one parameter
    Rectangle(double side) {
        this.length = side;
        this.breadth = side;
    }

    // Method to calculate area
    double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);
        Rectangle r3 = new Rectangle(4);

        System.out.println("Rectangle 1 Area: " + r1.calculateArea());
        System.out.println("Rectangle 2 Area: " + r2.calculateArea());
        System.out.println("Rectangle 3 Area: " + r3.calculateArea());
    }

}
