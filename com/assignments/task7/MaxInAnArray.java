package com.assignments.task7;

public class MaxInAnArray {
    public static void main(String[] args) {
        int[] numbers = {34, 67, 23, 89, 12, 90, 45};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum number in the array is: " + max);
    }

}
