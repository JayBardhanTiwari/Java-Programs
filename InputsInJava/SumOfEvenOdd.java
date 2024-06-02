package InputsInJava;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        int oddsum = 0;
        int evensum = 0;
        int store = 0;
        while (n > 0) {
            store = n % 10;
            if (store % 2 == 0) {
                evensum += store;
            } else {
                oddsum += store;
            }
            n = n / 10;
        }
        System.out.println("even total = :" + evensum);
        System.out.println("odd total is : " + oddsum);
    }
}
