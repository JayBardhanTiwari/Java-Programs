package Functions_Methods.Patterns_Advanced;

public class PalindromicpatternWithnumbers {
    public static void palindromicPattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // number- desending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // number- ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        palindromicPattern(8);
    }
}
