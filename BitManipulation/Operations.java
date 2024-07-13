package BitManipulation;

public class Operations {
    // 1. Get ith bit
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

    // 3.clear ith bit
    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // update bit
    public static int updateIthbit(int n, int i, int newbit) {
        // first approach

        // if (newbit == 0) {
        // return clearIthbit(n, i);
        // } else {
        // return setIthbit(n, i);
        // }

        // second approach
        n = clearIthbit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;

    }

    // clear ith bits
    public static int clearIbit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    // clear ith bits in range
    public static int clearithbitsinRange(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;

    }

    public static void main(String[] args) {
        // System.out.println(getIthbit(10, 3));
        // System.out.println(setIthbit(10, 2));
        // System.out.println(clearIthbit(10, 1));
        // System.out.println(updateIthbit(10, 2, 1));
        // System.out.println(clearIbit(15, 2));
        System.out.println(clearithbitsinRange(10, 2, 4));

    }
}
