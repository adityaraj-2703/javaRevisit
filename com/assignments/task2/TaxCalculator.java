package com.assignments.task2;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income in Lakhs: ");
        double income = sc.nextDouble();

        double tax = 0.0;

        if (income <= 2.5) {
            tax = 0.0;
        } 
        else if (income <= 6.0) {
            tax = (income - 2.5) * 0.10;
        } 
        else if (income <= 12.0) {
            tax = (3.5 * 0.10) + (income - 6.0) * 0.18;
        } 
        else {
            tax = (3.5 * 0.10) + (6.0 * 0.18) + (income - 12.0) * 0.25;
        }

        System.out.println("Income Tax to be paid: ₹" + (tax * 100000) + " INR");
        sc.close();
    }

}
