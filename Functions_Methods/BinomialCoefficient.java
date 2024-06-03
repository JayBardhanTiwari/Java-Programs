package Functions_Methods;

public class BinomialCoefficient {
    public static int Factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static int BinoCoeff(int n, int r) {
        int n_fac = Factorial(n);
        int r_fac = Factorial(r);
        int nMr_fac = Factorial(n - r);
        int BinoCoeff = n_fac / (r_fac * nMr_fac);
        return BinoCoeff;
    }

    public static void main(String[] args) {
        System.out.println(BinoCoeff(5, 2));

    }
}
