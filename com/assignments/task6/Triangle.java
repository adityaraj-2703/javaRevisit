package com.assignments.task6;

public class Triangle {
    int side1, side2, side3;

    
    Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    void printDetails() {
        int perimeter = side1 + side2 + side3;
        double s = perimeter / 2.0; 
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("Sides: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.printDetails();
    }

}
