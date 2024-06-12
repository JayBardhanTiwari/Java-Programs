package Questions;

public class RotatedSortedArrays {
    // min will have index of minimum element of nums

    public static int search(int nums[], int target) {
        int min = minSearch(nums);
        // find in sorted left
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, target, min, nums.length - 1);
        }
        // find in sorted right
        else {
            return search(nums, target, 0, min - 1);
        }

    }

    // binary search to find target in left to right boundary
    public static int search(int nums[], int target, int left, int right) {

        int l = left;
        int r = right;
        while (l <= r) {
            int mid = (r + l) / 2;
            if (nums[mid] == target) {
                return mid;

            }
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return -1;
    }

    // smallest element index
    public static int minSearch(int nums[]) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;

    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int nums2[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target2 = 3;
        int nums3[] = { 1 };
        int target3 = 0;

        System.out.println(search(nums, target));
        System.out.println(search(nums2, target2));
        System.out.println(search(nums3, target3));

    }
}