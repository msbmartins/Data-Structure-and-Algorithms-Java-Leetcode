package Leetcode.ArrayString;

public class MergeStrings {

    // 1768. Merge Strings Alternately - Easy

    public String mergeAlternately (String word1, String word2) {

        // Cache the lengths of the words
        int length1 = word1.length();
        int length2 = word2.length();
        int minLength = Math.min(word1.length(), word2.length());

        // Pre-allocate the StringBuilder with the total expected capacity
        StringBuilder sb = new StringBuilder(length1 + length2);

        // Intercalate characters from both words
        for(int i = 0; i < minLength; i++ ) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        // Append the remaining characters from the longer word, if any
        if (length1 > length2) {
            sb.append(word1.substring(minLength));
        } else if (length2 > length1) {
            sb.append(word2.substring(minLength));
        }

    return sb.toString();

    }

    public static void main (String[] args) {

        MergeStrings mergeStrings = new MergeStrings();

        String word1 = "abcd";
        String word2 = "pq";

        // Print input and output
        System.out.println("Word1: " + word1);
        System.out.println("Word2: " + word2);
        System.out.println("The merged String : " + mergeStrings.mergeAlternately(word1, word2));

    }
}
