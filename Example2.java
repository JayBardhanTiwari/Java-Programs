
public class Example2 {

    // array
    public static void backtrackArray(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        backtrackArray(arr, i + 1, val + 1);
        arr[i] = val - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // subsets of string
    public static void subsetString(String str, String ans, int i) {
        // base case
        if (i == str.length()) {

            if (ans == "") {
                System.out.println("null");

            } else {
                System.out.println(ans);

            }
            return;
        }

        // recursion
        subsetString(str, ans + str.charAt(i), i + 1);
        subsetString(str, ans, i + 1);

    }

    // permutation
    public static void permutationString(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // remove
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutationString(newStr, ans + ch);

        }
    }

    // issafe function
    public static boolean isSafe(char board[][], int row, int column) {
        // vertical up
        // isSafe(board, row-1, column);
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        // diagonal left
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // N-queens
    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }
        // loop for columns
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                } else {
                    board[row][j] = 'x';
                }

            }

        }
        return false;

    }

    // print board
    public static void printBoard(char board[][]) {
        System.out.println("------chess board------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    // GRID WAYS
    public static int gridWays(int n, int m, int i, int j) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        // recursion
        int right = gridWays(n, m, i, j + 1);
        int down = gridWays(n, m, i + 1, j);

        return right + down;
    }

    public static void main(String[] args) {


        // GRID WAYS
        int n = 3;// rows
        int m = 3;// columns
        System.out.println(gridWays(n, m, 0, 0));

    }
}
