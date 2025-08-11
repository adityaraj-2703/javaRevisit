package com.assignments.task7;

public class CountOccurencesOfEachCharacterInAString {
    public static void main(String[] args) {
        String str = "hello world";
        int[] charCount = new int[256]; 

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        System.out.println("Character occurrences in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }

}
