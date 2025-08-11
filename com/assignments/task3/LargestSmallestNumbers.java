package com.assignments.task3;

import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        sc.close();
    }
}
