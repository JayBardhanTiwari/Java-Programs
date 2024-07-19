package RecursionBasics;

public class Findlastoccurence_inArray {
    public static int lastOccurence(int arr[], int i, int key) {
        // base case
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7, 2, 5, 7 };
        System.out.println(lastOccurence(arr, 0, 5));
    }

}
