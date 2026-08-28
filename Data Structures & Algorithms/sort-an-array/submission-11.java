//insertion sort self
class Solution {
    public int[] sortArray(int[] nums) {
        int len=nums.length;
        for(int i=1;i<len;i++){
            int toInsert=nums[i];
            int j=i-1;
            for(;j>=0;j--){
                if(toInsert<=nums[j]){
                    nums[j+1]=nums[j];
                }
                else{
                    break;
                } 
            }
            nums[j+1]=toInsert;
        }
        return nums;
    }
}