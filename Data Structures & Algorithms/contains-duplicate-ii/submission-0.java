class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    while(k>0){
        int i=0;
        int j=k;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                return true;
            }
            i++;
            j++;
        }
        k--;
    }
    return false;
    }
}