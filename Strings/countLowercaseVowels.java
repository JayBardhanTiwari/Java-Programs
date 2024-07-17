package Strings;

import java.util.Scanner;

public class countLowercaseVowels {
    // Brute force approach

    // public static int countVowels(String str) {
    // int count = 0;
    // char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // for (int j = 0; j < vowels.length; j++) {
    // if (ch == vowels[j]) {
    // count++;
    // break;
    // }
    // }
    // }
    // return count;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        // System.out.println(countVowels(str));

        // optimized

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("vowels count is " + count);
    }
}
