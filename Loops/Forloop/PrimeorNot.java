package Loops.Forloop;

import java.util.*;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        Boolean isprime = true;
        if (n == 2) {
            System.out.println("n is  prime");

        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is multiple of i(i is not euqal to 1 or n )
                    isprime = false;
                }
            }
            if (isprime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("its not prime");
            }
        }

    }
}
