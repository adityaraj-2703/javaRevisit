package com.assignments.task2;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        double bill = 0.0;

        if (units <= 60) {
            bill = units * 0.30;
        } 
        else if (units <= 150) {
            bill = (60 * 0.30) + ((units - 60) * 0.75);
        } 
        else if (units <= 270) {
            bill = (60 * 0.30) + (90 * 0.75) + ((units - 150) * 1.10);
        } 
        else { // units > 270
            bill = (60 * 0.30) + (90 * 0.75) + (120 * 1.10) + ((units - 270) * 2.50);
        }

        // Add 20% surcharge
        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

        System.out.println("Electricity Bill (before surcharge):" + bill);
        System.out.println("Surcharge (20%):" + surcharge);
        System.out.println("Total Electricity Bill:" + totalBill);

        sc.close();
    }
}
