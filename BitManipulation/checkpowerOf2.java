package BitManipulation;

class checkpowerOf2 {
    public static boolean ispowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(ispowerOf2(3));

    }
}