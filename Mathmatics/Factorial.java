package Mathmatics;
public class Factorial {
    public static void main(String[] args) {
        int num=5;
        int value=1;
        for(int i=1;i<=num;i++){
            
            System.out.print(i +"*");
            
            
        }
        for(int i=1;i<=num;i++){
             value =i*value;
            
        }
        System.out.println(" "+ value);
    }
}
