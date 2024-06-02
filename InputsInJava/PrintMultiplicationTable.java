package InputsInJava;

import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " * " + i + " = " + i * n);
        }
    }
}
