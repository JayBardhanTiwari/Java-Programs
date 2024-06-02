package Loops.ContinueStatement;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // Disppay all number entered by user except multiple of 10
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("your number was : " + n);
        } while (true);
    }
}
