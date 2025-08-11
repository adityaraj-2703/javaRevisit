package com.assignments.task3;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0, count = 0, num = 2;

        while (count < n) {
            sum += num;
            num += 2;
            count++;
        }

        System.out.println("Sum of first " + n + " even numbers = " + sum);
        sc.close();
    }
}
