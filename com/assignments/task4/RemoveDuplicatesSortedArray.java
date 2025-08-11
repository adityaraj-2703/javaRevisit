package com.assignments.task4;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11,12};

        int n = nums.length;
        if (n == 0) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        int i = 0;
        int j = 0;
        while(j<nums.length){
            while(j<nums.length && nums[i]==nums[j]){
                j++;
            }
            if(j==nums.length){
                break;
            }
            nums[i+1] = nums[j];
            i++;
            j++;
        }
        i++;
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }

        System.out.println(Arrays.toString(nums));
    }

}
