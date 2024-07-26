package DivideandConquer;

class Mergesort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void mergeSort(int si, int ei, int arr[]) {
        // base case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;// or = (si+ ei)/2
        mergeSort(si, mid, arr);
        mergeSort(mid + 1, ei, arr);
        merge(si, ei, mid, arr);
    }

    // merge method to merge the sorted parts
    public static void merge(int si, int ei, int mid, int arr[]) {

        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left part
        int j = mid + 1;// iterator for right part;
        int k = 0;// iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;

        }
        // for leftover elements of 1st sorted arr
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        // for leftover elements of 2nd sorted arr

        while (j <= ei) {
            temp[k++] = arr[j++];

        }
        // copy temp to original array
        for (k = 0, i = si; i<=ei; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5,1,1,2,0,0 };
        mergeSort(0, arr.length - 1, arr);
        printArr(arr);

    }
}