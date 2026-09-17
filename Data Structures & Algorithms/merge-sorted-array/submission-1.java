class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;      // Position to fill in nums1
        int lastArr1 = m - 1;       // Last valid element in nums1
        int lastArr2 = n - 1;       // Last element in nums2
        
        // Merge from the end
        while (lastArr2 >= 0) {
            if (lastArr1 >= 0 && nums1[lastArr1] > nums2[lastArr2]) {
                nums1[last] = nums1[lastArr1];
                lastArr1--;
            } else {
                nums1[last] = nums2[lastArr2];
                lastArr2--;
            }
            last--;
        }
        
        // No need for additional copying - if nums2 is exhausted, 
        // the remaining elements in nums1 are already in place
    }
}