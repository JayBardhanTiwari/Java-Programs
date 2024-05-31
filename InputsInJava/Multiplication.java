package InputsInJava;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b ;
        System.out.println(product);
    }

}
