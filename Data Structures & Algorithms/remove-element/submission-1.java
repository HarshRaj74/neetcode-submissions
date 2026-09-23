class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length - 1;
        while(left<=right){
            if(nums[right]==val){
                right-=1;
                continue;
            }
            if(nums[left]==val){
                nums[left]=nums[right];
                right-=1;
                left+=1;
            }
            else{
                left+=1;
            }
        }
        return left;
    }
}