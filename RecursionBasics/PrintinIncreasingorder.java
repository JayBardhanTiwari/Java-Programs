package RecursionBasics;

public class PrintinIncreasingorder {

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        // for(int i = 1; i<=n;i++){
        // System.out.println(i);
        // }
        printInc(n);
    }

}
