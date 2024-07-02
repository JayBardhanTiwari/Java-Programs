package BitManipulation;

public class Operations {
    // 1. get ith bit
    public static int getIthbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    // 2. set ith bit
    public static int setIthbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(getIthbit(10, 3));
        System.out.println(setIthbit(10, 2));
    }
}
