package com.assignments.task7;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedCharacter(input);
        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
    public static char findFirstNonRepeatedCharacter(String str) {
        int[] charCount = new int[256]; 
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }
        return '\0'; 
    }

}
