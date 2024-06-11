package MaxSubArraySum;

public class KadanesAlgo {
    public static int Kadanes(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < number.length; i++) {
            currSum += number[i];
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
        int number[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(Kadanes(number));

    }

}