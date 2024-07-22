package RecursionBasics;

public class Binarystringproblem {
    public static void printbinaryString(String str, int lastplace, int n) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (lastplace == 0) {

            printbinaryString(str + "0", 0, n - 1);

            printbinaryString(str + "1", 1, n - 1);
        } else {// last place is 1

            printbinaryString(str + "0", 0, n - 1);

        }
        // another way

        // printbinaryString(str + "0", 0, n - 1);
        // if (lastplace == 0) {
        // printbinaryString(str + "1", 1, n - 1);
        // }

    }

    public static void main(String[] args) {
        printbinaryString("", 0, 4);
    }
}
