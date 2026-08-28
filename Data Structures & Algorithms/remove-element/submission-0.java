class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int temp = 0;
        
        // Fix 1: Must be <= so the element where they meet gets checked
        while (i <= j) {
            if (nums[i] != val && nums[j] != val) {
                i += 1;
            }
            else if (nums[i] != val && nums[j] == val) {
                j -= 1;
                i += 1;
            }
            else if (nums[i] == val && nums[j] != val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                // Fix 2: Move both pointers immediately after a successful swap!
                i += 1;
                j -= 1;
            }
            else {
                j -= 1;
            }
        }
        // Fix 3: 'i' naturally holds the count of valid elements remaining
        return i;  
    }
}