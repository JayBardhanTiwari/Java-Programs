package DivideandConquer.Questions;

class Solution {
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort(int nums[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // divide
        int mid = si + (ei - si) / 2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid + 1, ei);

        // merge
        merge(nums, si, mid, ei);

    }

    public static void merge(int nums[], int si, int mid, int ei) {
        // making a temp arr
        int temp[] = new int[ei - si + 1];
        // iterator
        int i = si;// for left part
        int j = mid + 1;// for right part
        int k = 0;// for temp arr

        while (i <= mid && j <= ei) {
            // for left part
            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;

            }
            // for right part
            else {
                temp[k] = nums[j];
                j++;

            }
            k++;
        }
        // leftover for 1 part
        while (i <= mid) {
            temp[k++] = nums[i++];

        }
        // left over for 2 part
        while (j <= ei) {
            temp[k++] = nums[j++];
        }
        // copy the temp arr to original arr
        for (k = 0, i = si; k<temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }
    public static void printArr(int nums[]){
        for(int i = 0; i< nums.length;i++){
            System.out.print(nums[i] +" ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 2, 3, 1};
        // System.out.println(sortArray(nums));
        sortArray(nums);
        printArr(nums);
    }

}
