package Basic_Sorting;

public class Countingsort {
    public static void countingSort(int nums[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        // count arr
        int count[] = new int[largest + 1];// + 1 beacause zero included too

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;

        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }

        }
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(nums);
        printArray(nums);
    }
}