package ArrayList.Questions;

import java.util.ArrayList;

class Mostfrequentnumberfollowingkey {
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[1001]; // Array size to accommodate values up to 1000

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int nextNum = nums.get(i + 1);
                if (nextNum >= 0 && nextNum <= 1000) { // Check if nextNum is within bounds
                    result[nextNum]++;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i <= 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(100);
        nums.add(2);
        nums.add(100);
        nums.add(2);
        nums.add(3);

        int key = 2;
        System.out.println(mostFrequent(nums, key)); // Expected output: 1000
    }
}
