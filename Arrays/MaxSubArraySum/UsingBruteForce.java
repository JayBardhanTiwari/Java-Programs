package MaxSubArraySum;

public class UsingBruteForce {
    // Time complexity = O(n³)

    public static void maxSubarraySum(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        // outer loop
        for (int i = 0; i < number.length; i++) {
            int start = i;

            // nested loop
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    currSum += number[k];
                }
                System.out.print("sum : " + currSum);

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        maxSubarraySum(number);
    }
}