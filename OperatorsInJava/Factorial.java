package OperatorsInJava;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int value = 1;
        for (int i = num; i >= 1; i--) {
            System.out.print(i);
            if(i>1){
                System.out.print("*");
            }

      
            value = i * value;

        }
        System.err.println();
        System.out.println(value);

    }
}
