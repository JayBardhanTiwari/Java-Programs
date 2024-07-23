package RecursionBasics.Questions;

public class Towerofhanoi {// 0(2^n)
    public static void moveDisks(int n, String src, String helper, String des) {

        // base case
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + des);
            return;

        }
        moveDisks(n - 1, src, des, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to" + des);
        moveDisks(n - 1, helper, src, des);

    }

    public static void main(String[] args) {
        int n = 3;
        moveDisks(n, "S", "H", "D");

    }
}
