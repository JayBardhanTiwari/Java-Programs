package Backtracking;

public class Array {
    public static void arrayChange(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        arrayChange(arr, i + 1, val + 1);// fun() call step
        arr[i] = arr[i] - 2;// backtracking step

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        arrayChange(arr, 0, 1);
        printArr(arr);

    }

}
