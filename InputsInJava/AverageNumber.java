package InputsInJava;

import java.util.Scanner;

public class AverageNumber {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int average = (a + b + c) / 3;
      System.out.println("AverageNumber is : 5 " + average);

   }

}
