package RecursionBasics;

public class PrintinDecreasingorder {

    public static void printDec(int n) {
        if (n == 1) {       //stops when n = 1 
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);// calling itself
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
