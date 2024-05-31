package JavaBasics;

import java.util.Scanner;

public class IntputInJava {
    public static void main(String[] args) {
        //First we have to make Scanner class
        Scanner sc = new Scanner(System.in);
        
             String input = sc.next(); // Now its stores a single word input
              System.out.println(input);

            String name = sc.nextLine();// nextline stores can Names,Paragraphs,Sentences
            System.out.println(name);

            int number = sc.nextInt();//It takes numbers as Input
            System.out.println(number);

            float decimal = sc.nextFloat();//It takes float values as Input
            System.out.println(decimal);

            double price = sc.nextDouble();//It takes double values as Input
            System.out.println(price);

            long big= sc.nextLong();//It takes long values as Input
            System.out.println(big);

            boolean b = sc.nextBoolean();//It takes boolean values as Input
            System.out.println(b);

            short n= sc.nextShort();//It takes short values as Input
            System.out.println(n);


    }
}
