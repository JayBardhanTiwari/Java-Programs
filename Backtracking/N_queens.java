package Backtracking;

public class N_queens {

    public static boolean isSafe(char board[][], int row, int column) {
        // vertically up
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

    public static void nQueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;

            return;
        }
        // loop for column
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // placing queen
                nQueen(board, row + 1); // function call
                board[row][j] = 'x'; // backtracking call
            }

        }

    }

    // function for print board
    public static void printBoard(char board[][]) {
        System.out.println("------chess board-------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // intialization
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
        System.out.println("total ways to solve n queens = " + count);

    }

}
