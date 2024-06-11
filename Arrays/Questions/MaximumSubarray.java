package Questions;

public class MaximumSubarray {
    public static int maxSubarrays(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        // test cases

        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int nums2[] = { -1 };

        System.out.println(maxSubarrays(nums));// Output: 6
        System.out.println(maxSubarrays(nums2));// Output: -1

    }
}