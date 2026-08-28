//bubble sort
//bubble the largest to the top
//with swapped boolean optimization
class Solution {
    public int[] sortArray(int[] nums) {
        int temp;
        int len=nums.length;
        for(int i=0;i<len;i++){
            boolean swapped=false;
            for(int j=0;j<len-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
                else{
                    continue;
                }
            }
            if(!swapped){
                    return nums;
                }
        }
    return nums;
    }
}