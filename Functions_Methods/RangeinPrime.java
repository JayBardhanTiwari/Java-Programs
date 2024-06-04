package Functions_Methods;

public class RangeinPrime {
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void rangeinPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {// true
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        rangeinPrime(10);

    }
}
