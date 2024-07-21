package RecursionBasics;

public class Printpowerofx {
    public static int printPower(int x,int n){
        if(n == 1){
            return x;
        }
        int nm1 = printPower(x, n-1);
        int total = x * nm1;
        return total;
    }
    public static void main(String[] args) {
        int x = 2;
        System.out.println(printPower(x, 10));
    }
}
