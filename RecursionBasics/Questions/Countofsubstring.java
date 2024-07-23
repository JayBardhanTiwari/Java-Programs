package RecursionBasics.Questions;

public class Countofsubstring {

    public static int countString(String str, int i, int j, int n) {
        // base case
        if (n == 1) {
            return 1;

        }

        if (n <= 0) {
            return 0;
        }
        int res = countString(str, i + 1, j, n - 1) + countString(str, i, j - 1, n - 1)
                - countString(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;

    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countString(str, 0, n - 1, n));
    }
}
