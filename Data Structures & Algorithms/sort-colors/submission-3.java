//dutch national flag
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1){return;}
        int l=0;
        int m=0;
        int r=nums.length-1;
        int temp=0;
        while(m<=r){
            if(nums[m]==0){
                temp=nums[l];
                nums[l]=nums[m];
                nums[m]=temp;
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                temp=nums[r];
                nums[r]=nums[m];
                nums[m]=temp;
                r--;
            }
        }
    }
}