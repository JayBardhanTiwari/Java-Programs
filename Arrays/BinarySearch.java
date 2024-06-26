public class BinarySearch {
    /*
     * Binary search
     * Time complexity -- O(log n)
     * Space complexity -- O(1)
     */
    public static int Binary_Search(int number[], int key) {

        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparison
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {// right
                start = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 6;
        System.out.println(Binary_Search(number, key));
    }
}
