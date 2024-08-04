package Leetcode;

import java.util.*;

public class MaketwoarrEqualsbyreverse {

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        // Arrays.sort(target);

        for (int i = 0; i < target.length; i++) {
            if (arr[i] != target[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        // make two array equals by reversing it

        int target[] = { 3, 7, 11 };
        int arr[] = { 3, 7, 9 };
        System.out.println(canBeEqual(target, arr));
    }
}
