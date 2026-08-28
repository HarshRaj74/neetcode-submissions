//insertion sort 
//takes on element and inserts into the right position sorted/unsorted  portion

class Solution {
    public int[] sortArray(int[] nums) {
        int len=nums.length;
        int curr;
        int temp;
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
            //for each element compare with all elements before it and 
            //if find the outer element greater than equal to 1st 2nd of earlier then
            //continue ie move further in inner loop
            //if outer element is less than inner, then replace the inner with 
            //the outer and shift inner till the outer 
                if(nums[j]<=nums[i]){
                    continue;
                }
                else{
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    //to shift after inserting 
                    //since now nums[i] has the nums[j] so 
                    //shifting will effectively happen;
                }
            }
        }
        return nums;
    }
}