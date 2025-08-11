package com.assignments.task4;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); 

        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println(key + " is present in the array.");
        } else {
            System.out.println(key + " is NOT present in the array.");
        }

        sc.close();
    }

}
