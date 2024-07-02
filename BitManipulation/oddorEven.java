package BitManipulation;

public class oddorEven {
    public static void checkoddorEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        checkoddorEven(5);
        checkoddorEven(8);
        checkoddorEven(15);
    }
}
