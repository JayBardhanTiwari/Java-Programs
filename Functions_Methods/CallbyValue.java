package Functions_Methods;

public class CallbyValue {

    public static void Swap(int a, int b) {
    //swap
    int temp= a;
        a=b;
        b= temp;

    }
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
      
        Swap(a, b);
        System.out.println("Value os a : " + a);
        System.out.println("Value of b : " + b);
   
  
    }

}
