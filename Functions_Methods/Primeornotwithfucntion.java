package Functions_Methods;

public class Primeornotwithfucntion {
    // public static boolean Prime(int n){
    // // corner case
    // if(n==2){
    // return true;
    // }
    // for(int i = 2;i<=n-1;i++){
    // if(n%i==0){
    // return false;
    // }
    // }
    // return true;
    // }
    public static boolean Prime(int n) {
        // Optimized Prime or not number
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.err.println(Prime(112));

    }
}
