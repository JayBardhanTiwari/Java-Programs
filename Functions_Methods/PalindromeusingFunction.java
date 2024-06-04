package Functions_Methods;

import java.util.Scanner;

public class PalindromeusingFunction {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (number > 0) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        if (original == reverse) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number : ");

        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }
}
