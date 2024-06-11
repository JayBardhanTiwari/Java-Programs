package Questions;

public class NumberOfGoodPair {
    public static int numIdenticalPairs(int[] nums) {
        int tp = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (count == nums[j]) {
                    tp++;
                }

            }
        }
        return tp;
    }

    public static void main(String[] args) {
        // test cases

        int nums[] = { 1, 2, 3, 1, 1, 3 };
        int nums2[] = { 1, 1, 1, 1 };

        System.out.println(numIdenticalPairs(nums));// Output: 4
        System.out.println(numIdenticalPairs(nums2));// Output: 6

    }
}
