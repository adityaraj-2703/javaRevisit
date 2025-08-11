package com.assignments.task6;

import java.util.Scanner;

public class Complex {
    double real;
    double imag;

    
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    
    Complex multiply(Complex c) {
        double realPart = (this.real * c.real) - (this.imag * c.imag);
        double imagPart = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(realPart, imagPart);
    }

    
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        
        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        System.out.print("Sum: ");
        c1.add(c2).display();

        System.out.print("Difference: ");
        c1.subtract(c2).display();

        System.out.print("Product: ");
        c1.multiply(c2).display();

        sc.close();
    }

}
