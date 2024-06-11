package Questions;

public class RotatedSortedArrays {
    public static int sortedArray(int nums[],int target){

        int start =0;
        int end = nums.length-1;
        while(start <=end){
        int mid = (start + end)/ 2;


            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start= mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
        int nums[] = { 4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(sortedArray(nums, target));
    }
}
