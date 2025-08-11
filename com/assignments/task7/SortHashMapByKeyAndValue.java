package com.assignments.task7;

import java.util.HashMap;

import java.util.Map;


public class SortHashMapByKeyAndValue {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int res = 0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            res += hm.getOrDefault(sum-k,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        SortHashMapByKeyAndValue sh = new SortHashMapByKeyAndValue();
        int[] nums = {1, 2, 3};
        int k = 3;
        int result = sh.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
        
    }

}
