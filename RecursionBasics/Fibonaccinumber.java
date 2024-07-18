package RecursionBasics;

public class Fibonaccinumber {
    public static int findFibo(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        // Formula of Fibonacci -> fn = f(n-1) + f(n-2);
        int fnm1 = findFibo(n - 1);
        int fnm2 = findFibo(n - 2);

        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFibo(n));
    }
}
