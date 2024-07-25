package DivideandConquer.Questions;

class Easylvl {

    public static String[] mergeSort(String arr[], int low, int high) {
        // base case
        if (low == high) {
            String[] A = { arr[low] };
            return A;
        }
        int mid = low + (high - low) / 2;
        String arr1[] = mergeSort(arr, low, mid);
        String arr2[] = mergeSort(arr, mid + 1, high);

        String arr3[] = merge(arr1, arr2);
        return arr3;

    }

    public static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        String arr3[] = new String[m + n];

        // indexes
        int i = 0;// iterator of left part
        int j = 0;// iterator of right part
        int k = 0;// iterator of new String array arr3

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                // true
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                // false
                arr3[k] = arr2[j];
                j++;
                k++;
            }

        }
        // leftover 1 part
        while (i < m) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        // leftover 2 part
        while (j < n) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {// compare based on unicode value of each character in Strings
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        String[] a = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}

/*
 * Return Values: of compareTo function
 * 
 * 1.Zero (0): If the two strings are equal.
 * 2.Negative Integer: If the string on which the method is called (str1) is
 * lexicographically less than the string passed as an argument (str2).
 * 3.Positive Integer: If str1 is lexicographically greater than str2.
 */