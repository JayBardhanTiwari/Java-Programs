package JavaBasics;
import java.util.Scanner;

public class SumbyUserInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int value2 = sc.nextInt();

        int sum = value + value2 ;
        System.out.println(sum);
    }
}
