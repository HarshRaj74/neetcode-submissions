//selection sort
class Solution {
    public int[] sortArray(int[] nums) {
        int length=nums.length;
        int temp;
        int index_for_max=0;
        for(int i=length-1; i>0;i--){
            index_for_max=i;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[index_for_max]){
                    index_for_max=j;
                }
                else{
                    continue;
                }

            }
            temp=nums[i];
            nums[i]=nums[index_for_max];
            nums[index_for_max]=temp;
        }
    return nums;
    }
}