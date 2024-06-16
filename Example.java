public class Example {
    public static void arrayPairSum(int[] nums) {
        // Sorting
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
             
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    //     int sum = 0;
    //     for (int i = 0; i < nums.length; i += 2) {
    //         if (i + 1 < nums.length) {
    //             sum += Math.min(nums[i], nums[i + 1]);
    //         }
    //     }

    //     return sum;

    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 7,3,1,0,0,6 };
        arrayPairSum(nums);
        printArray(nums);

    }
}
