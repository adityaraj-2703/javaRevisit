package com.assignments.task4;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumPair {
    public static void main(String[] args) {
        int[] nums = {1, 4, 10, -3};
        int target = 14;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // no pair found
    }

}
