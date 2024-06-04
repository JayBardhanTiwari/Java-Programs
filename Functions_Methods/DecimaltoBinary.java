package Functions_Methods;

public class DecimaltoBinary {
    public static void decTobin(int n) {
        int binary = n;
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int rem = n % 2;
            dec = dec + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of " + binary + " = " + dec);

    }

    public static void main(String[] args) {
        decTobin(7);
    }
}
