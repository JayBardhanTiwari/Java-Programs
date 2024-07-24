package DivideandConquer;

class Roatedsortedarray {

    public static int search(int nums[], int key, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;// (si+ ei )/ 2

        // case Found
        if (nums[mid] == key) {
            return mid;
        }

        // mid on line 1
        if (nums[si] <= nums[mid]) {
            // case a: left
            if (nums[si] <= key && key <= nums[mid]) {
                return search(nums, key, si, mid - 1);
            }
            // case b: right
            else {
                return search(nums, key, mid + 1, ei);
            }
        }
        // mid on line 2

        else {
            // case c: right
            if (nums[mid] <= key && key <= nums[ei]) {
                return search(nums, key, mid + 1, ei);

            } else {
                // case d : left
                return search(nums, key, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 0;// output -> 4
        System.out.println(search(nums, key, 0, nums.length - 1));
    }
}
