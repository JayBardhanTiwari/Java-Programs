public class Example2 {

    public static void getArray(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        getArray(arr, i + 1, val + 1);
        // backtracking
        arr[i] = val - 2;

    }

    // array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // subsets of string
    public static void getSubset(String str, String ans, int i) {
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
        getSubset(str, ans + str.charAt(i), i + 1);
        // no
        getSubset(str, ans, i + 1);

    }

    // permutation
    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            // "abcdef" = "ab" + "def" = "abdef"
            // fetch
            char curr = str.charAt(i);
            // remove
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // add
            permutation(newStr, ans + curr);
        }

    }

    public static void main(String[] args) {

        // int arr[] = new int[5];
        // getArray(arr, 0, 1);
        // printArr(arr);
        // getSubset("abc", "", 0);
        permutation("abc", "");

    }
}
