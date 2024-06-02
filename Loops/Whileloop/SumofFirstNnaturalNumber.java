package Loops.Whileloop;

import java.util.Scanner;

public class SumofFirstNnaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int range = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= range) {
            sum = sum + i;
            i++;

        }
        System.out.println("sum is : " + sum);

    }

}