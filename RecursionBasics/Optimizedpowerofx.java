package RecursionBasics;

public class Optimizedpowerofx {
    public static int optimizedPower(int x, int n) {// O(log n)
        // x^n
        // base case
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(x, n / 2);
        int halfpowersq = halfpower * halfpower;
        // when power is odd
        if (n % 2 != 0) {
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));

    }
}
