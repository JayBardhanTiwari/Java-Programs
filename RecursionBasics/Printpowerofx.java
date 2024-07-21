package RecursionBasics;

public class Printpowerofx {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int nm1 = printPower(x, n - 1);
        int total = x * nm1;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(printPower(2, 10));
    }
}
