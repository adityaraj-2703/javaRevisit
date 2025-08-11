package com.assignments.task7;

public class NumberOfWordsInAString {
    public static void main(String[] args) {
        String sentence = "Hello world, this is a test string.";
        int wordCount = countWords(sentence);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

}
