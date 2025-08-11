package com.assignments.task7;

import java.util.HashSet;
import java.util.Set;

class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        Set<Integer> ans = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int[] ans1 = new int[ans.size()];
        int i=0;
        for(int t : ans){
            ans1[i] = t;
            i++;
        }
        return ans1;

    }
    public static void main(String[] args) {
        ArrayIntersection ai = new ArrayIntersection();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = ai.intersection(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
