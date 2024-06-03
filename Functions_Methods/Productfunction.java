package Functions_Methods;

public class Productfunction {
    public static int Multiple(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int prod = Multiple(5, 10);
        System.out.println("Your multiplications is  : " + prod);
        prod = Multiple(18, 89);
        System.out.println("Your multiplications is  : " + prod);

    }
}
