package DivideandConquer;

class Roatedsortedarray {

    public static int search(int arr[], int key, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;// (si+ ei )/ 2

        // case Found
        if (arr[mid] == key) {
            return mid;
        }

        // mid on line 1
        if (arr[si] <= arr[mid]) {
            // case a: left
            if (arr[si] <= key && key <= arr[mid]) {
                return search(arr, key, si, mid - 1);
            }
            // case b: right
            else {
                return search(arr, key, mid + 1, ei);
            }
        }
        // mid on line 2

        else {
            // case c: right
            if (arr[mid] <= key && key <= arr[ei]) {
                return search(arr, key, mid + 1, ei);

            } else {
                // case d : left
                return search(arr, key, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 0;// output -> 4
        System.out.println(search(arr, key, 0, arr.length - 1));
    }
}
