package InputsInJava;

import java.util.Scanner;

public class FactorialbyuserInput {
    public static void main(String[] args) {
        int fact = 1;
        System.out.println("Enter a positive integer : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is : " + fact);
    }
}
