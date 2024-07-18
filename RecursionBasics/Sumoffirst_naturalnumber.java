package RecursionBasics;

public class Sumoffirst_naturalnumber {
    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm = sumNatural(n - 1);
        // int Sn = n + sumNatural(n-1);
        int Sn = n + Snm;

        return Sn;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumNatural(n));
    }

}
