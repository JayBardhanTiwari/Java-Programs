public class Example2 {
    public static int xorOperation(int n, int start) {
        int nums = 0;
        for (int i = 0; i < n; i++) {
            nums ^= (start + (2 * i));
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));

    }
}
