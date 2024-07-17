package Strings;

import java.util.Arrays;

class angramWord {

    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        // Covert Strings to lowercase . Why? so that we dont have to check
        // separately for lower & uppercase .

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First Cheak - if the lengths are the same
        if (str1.length() == str2.length()) {

            // covert strings into char array
            char[] charstr1 = str1.toCharArray();
            char[] charstr2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charstr1);
            Arrays.sort(charstr2);

            // if the sorted char arrays are same or identical then strings are
            // anagram
            boolean result = Arrays.equals(charstr1, charstr2);

            if (result) {
                System.out.println(str1 + "and " + str2 + " is a anagram ");
            } else {
                System.out.println(str1 + " and" + str2 + " is not anagram");
            }

            // case when length are not equal
        } else {
            System.out.println(str1 + "and " + str2 + " is not anagram");
        }

    }
}