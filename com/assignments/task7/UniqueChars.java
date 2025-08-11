package com.assignments.task7;

public class UniqueChars {
    public static void main(String[] args) {
        String input = "hello world";
        boolean hasUniqueChars = hasAllUniqueChars(input);
        if (hasUniqueChars) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }
    }
    public static boolean hasAllUniqueChars(String str) {
        boolean[] charSet = new boolean[256]; // Assuming ASCII characters
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false; 
            }
            charSet[val] = true; 
        }
        return true; 
    }

}
