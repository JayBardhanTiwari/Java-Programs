package If_Else;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 140;
        int b = 101;
        int c = 100;
        // Add operators means if both conditions are true
        if (a > b && a > c) {

            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

}
