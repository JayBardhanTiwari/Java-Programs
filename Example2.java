public class Example2 {
    public static int sumXOR(int nums[]) {
        int total = 0;
        // total += getXOR(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums.length == 0) {
                total += 0;
            }
            total += nums[i];
            // {5,1,6}

            for (int j = i + 1; j < nums.length; j++) {
                total += nums[i] ^ nums[j];

            }

        }
        for(int i = 0; i < nums.length;i++){
            
        }
        
        
        return total;
    }
    // public static int getXOR(int nums[]){
    //     int total = 0;
    //     for(int i = 0 ; i < nums.length; i++){
    //         total ^= nums[i];
    //     }
    //     return total;
            
    // }

    public static void main(String[] args) {
        int nums[] = { 3,4,5,6,7,8 };
        System.out.println(sumXOR(nums));
        // System.out.println(getXOR(nums));
    }
}
/*
 * Explanation: The 4 subsets of [1,3] are:
 * - The empty subset has an XOR total of 0.
 * - [1] has an XOR total of 1.
 * - [3] has an XOR total of 3.
 * - [1,3] has an XOR total of 1 XOR 3 = 2.
 * 0 + 1 + 3 + 2 = 6
 */
/*
 * Explanation: The 8 subsets of [5,1,6] are:
 * - The empty subset has an XOR total of 0.
 * - [5] has an XOR total of 5.
 * - [1] has an XOR total of 1.
 * - [6] has an XOR total of 6.
 * - [5,1] has an XOR total of 5 XOR 1 = 4.
 * - [5,6] has an XOR total of 5 XOR 6 = 3.
 * - [1,6] has an XOR total of 1 XOR 6 = 7.
 * - [5,1,6] has an XOR total of 5 XOR 1 XOR 6 = 2.
 * 0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28
 */
