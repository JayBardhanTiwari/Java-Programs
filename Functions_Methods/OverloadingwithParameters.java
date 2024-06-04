package Functions_Methods;

public class OverloadingwithParameters {
    // func to calculate sum of 2 num
    public static int sum(int a, int b) {
        return a + b;
    }

    // fumc to calculate sum of 3 num
    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 5, 5));

    }
}
