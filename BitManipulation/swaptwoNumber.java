package BitManipulation;

public class swaptwoNumber {

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("before swap: value of x = " + x + " value of y  = " + y);

        // swap using XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("after swap : value of x = " + x + " value of y =  " + y);

    }
}
