package Functions_Methods;

import java.util.Scanner;

public class FuncWithParameters {
    public static int CalculateSum(int num1, int num2) //Formal parmeter or parameter
    {

        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);// Actual parameters or arguments
        System.out.println("sum is : " +sum);

    }

}
