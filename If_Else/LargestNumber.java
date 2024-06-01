package If_Else;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 120;
        int c = 140;
        // Add operators means if both conditions are true
        if (a > b && a > c) {

            System.out.println("Largest is a");
        } else if (b >= c) {
            System.out.println("Largest is b");
        } else {
            System.out.println("Largest is c");
        }
    }

}
