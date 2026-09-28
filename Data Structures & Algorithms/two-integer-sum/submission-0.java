class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int[] output=new int[2];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                output= new int[] {hm.get(target-nums[i]),i};
                break;
            }
            hm.put(nums[i],i);
        }
        return output;
    }
}
