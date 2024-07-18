package RecursionBasics;

public class Factorialof_n {

    public static int findFac(int n) {

        if (n == 0) {
            return 1;
        }

        int Fnm = findFac(n - 1);
        // int Fn = n * findFac(n - 1);
        int Fn = n * Fnm;

        return Fn;
    }

    public static void main(String[] args) {
        System.out.println(findFac(5));

    }
}
