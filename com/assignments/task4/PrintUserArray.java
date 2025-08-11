package com.assignments.task4;

import java.util.Scanner;

public class PrintUserArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

}
