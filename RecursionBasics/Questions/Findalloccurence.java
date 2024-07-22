package RecursionBasics.Questions;

public class Findalloccurence {
    public static void findallOccurence(int arr[], int i, int key) {
        // base case
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        findallOccurence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        findallOccurence(arr, 0, 2);
    }
}
