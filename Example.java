class Solution {
    public int maximum69Number (int num) {
        char[] nums = Integer.toString(num).toCharArray();
        // int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]=='6'){
                nums[i]='9';
                // count+=1;
                // if(count==2){
                    break;
                // }
            }
        }
        return Integer.parseInt(new String(nums));
    }
}