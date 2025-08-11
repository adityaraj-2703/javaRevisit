package com.assignments.task7;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsOfAString {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All permutations of the string \"" + str + "\":");
        List<String> al = new ArrayList<>();
        generatePermutations(al, str, "",0);
    }

    private static void generatePermutations(List<String> al, String str, String current,int ind) {
        if (current.length() == str.length()) {
            al.add(current);
            System.out.println(current);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (current.indexOf(str.charAt(i)) == -1) { 
                generatePermutations(al, str, current + str.charAt(i),i);
            }
        }
    }

}
