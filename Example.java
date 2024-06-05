public class Example {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
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

    public static void main(String[] args) {

        System.out.println(isPrime(80));
    }
}
