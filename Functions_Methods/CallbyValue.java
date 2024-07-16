package Functions_Methods;

public class CallbyValue {

    public static void Swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Swap(a, b);
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
/*
 * When you pass a value in function it does not pass the original value of that variable
 * it makes a copy of original value then that copy goes to the function
 */