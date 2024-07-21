package RecursionBasics;

public class Tilingproblem {
    // 2 x n
    // where n is floor length
    // 2 is breadth which is fixed
    public static int countTiles(int n) {

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical tiles
        int fnm1 = countTiles(n - 1);
        // horizontal tiles
        int fnm2 = countTiles(n - 2);
        int total = fnm1 + fnm2;

        return total;

    }

    public static void main(String[] args) {
        System.out.println(countTiles(4));

    }
}
