//dnf pointers in which swa
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1) return;
        int l=0, m=0, h=nums.length-1, temp=0;
        while(m<=h){
            if(nums[m]==0){
                temp=nums[l];
                nums[l]=nums[m];
                nums[m]=temp;
                l++;
                m++;
            }
            else if(nums[m]==1) {m++;}
            else{
                temp=nums[h];
                nums[h]=nums[m];
                nums[m]=temp;
                h--;

            }

        }
    }
}