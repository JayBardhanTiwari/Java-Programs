package OperatorsInJava;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        int num= 4;
        int sum = 0;
        int add = 0;
        for(int i=0;i<num;i++){

            sum = sum + 1;
            add = sum + add;
           

        }
        System.out.println(add);
    }
    
}
