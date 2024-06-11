package Questions;

public class ContainsDuplicate {
    public static boolean duplicateArrays(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // test cases

        int nums[] = { 1, 2, 3, 6, 4 };
        int nums2[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(duplicateArrays(nums));// Output: false
        System.out.println(duplicateArrays(nums2));// Output: true

    }

}