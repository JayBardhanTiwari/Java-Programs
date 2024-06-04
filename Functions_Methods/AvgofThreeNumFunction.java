package Functions_Methods;

import java.util.Scanner;

public class AvgofThreeNumFunction {
    public static double Average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter your second number : ");
        double b = sc.nextDouble();
        System.out.print("Enter your third number : ");
        double c = sc.nextDouble();
        System.out.print("The average of three is : " + Average(a, b, c));

    }

}
