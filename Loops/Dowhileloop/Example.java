package Loops.Dowhileloop;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // Keep entering a number till user enters a multiple of 10

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);

    }

}
