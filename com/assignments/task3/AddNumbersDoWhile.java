package com.assignments.task3;

import java.util.Scanner;

public class AddNumbersDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum = " + sum);

            System.out.print("Do you want to perform again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("Program terminated.");
    }

}
