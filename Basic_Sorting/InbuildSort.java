package Basic_Sorting;

import java.util.*;

public class InbuildSort {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(Integer nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(nums); // sort in increasing order
        printArray(nums);

        int nums2[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(nums2, 0, 3);// sort the indexes from 0 to 2 only
        printArray(nums2);

        Integer nums3[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(nums3, Collections.reverseOrder());// reverse order
        printArray(nums3);
        Integer nums4[] = { 8, 9, 10, 3, 2 };
        Arrays.sort(nums4, 0, 3, Collections.reverseOrder());
        printArray(nums4);

    }
}
