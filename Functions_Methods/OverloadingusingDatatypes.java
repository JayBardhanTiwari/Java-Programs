package Functions_Methods;

public class OverloadingusingDatatypes {
    // func with int data type
    public static int sum(int a, int b) {
        return a + b;
    }

    // func with float data type
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(4.4f, 5.6f));
    }

}
