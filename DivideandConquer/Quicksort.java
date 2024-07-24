package DivideandConquer;

public class Quicksort {
    public static void quickSort(int si, int ei, int arr[]) {
        // base case
        if (si >= ei) {
            return;
        }
        // find pivot = last element
        int pivotindex = partition(si, ei, arr);
        quickSort(si, pivotindex - 1, arr);
        quickSort(pivotindex + 1, ei, arr);

    }

    public static int partition(int si, int ei, int arr[]) {
        int pivot = arr[ei];
        int i = si - 1;// to make place for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // now find out the pivot right index
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(0, arr.length - 1, arr);
        printArr(arr);

    }

}
