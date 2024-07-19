public class Example3 {

    public static boolean checkSorted(int i, int arr[]) {

        // decreasing order
        // increasing order
        // factorial order fn = n * fn(n-1);
        // sum of natural numbers
        // fibonacci series -> fn = fn(n-1) + fn(n-2);
        // is arry sorted or not

        if (i == arr.length - 1) {
            return true;
        } else if (arr[i] > arr[i + 1]) {
            return false;
        }
        return checkSorted(i + 1, arr);

    }

    public static void main(String[] args) {
        // recursion
        // print 5 to n
        int arr[] = { 1, 7, 3, 4, 5 };

System.out.println(checkSorted(0, arr));
    }
}
