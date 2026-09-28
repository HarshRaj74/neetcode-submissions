class Solution {
    public int subarraySum(int[] nums, int k) {
        int len=nums.length;
        int[] prefix=new int[len];
        int result=0;
        prefix[0]=nums[0];
        int current=0;

        //current sum
        //so we pass through the array and check if hm contains the remaining
        // also dont need indexing
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(0, 1);
        for(int num:nums){
            current+=num;
            if(hm.containsKey(current-k)){
                result+=hm.get(current-k);
            }
            hm.put(current,hm.getOrDefault(current, 0)+1);
        }
        return result;

    }
    
}