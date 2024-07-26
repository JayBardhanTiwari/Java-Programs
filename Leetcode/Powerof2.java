package Leetcode;

class Solution {
    public static boolean isPowerOfTwo(int n) {

        // base case
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));// false
        System.out.println(isPowerOfTwo(8));// true
    }

}