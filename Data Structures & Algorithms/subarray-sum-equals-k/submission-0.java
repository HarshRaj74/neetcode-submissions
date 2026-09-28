class Solution {
    public int subarraySum(int[] nums, int k) {
        int len=nums.length;
        int[] prefix=new int[len];
        int result=0;
        prefix[0]=nums[0];
        for(int i=1;i<len;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }

//if building result along with hm then can get faster
//if k-lookup exist in hm add count to result in both cases add or increment lookup
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(0, 1);
        for(int i=0;i<len;i++){
            if(hm.containsKey(prefix[i]-k)){
            result+=hm.get(prefix[i]-k);
            }
            if(hm.containsKey(prefix[i])){
                hm.put(prefix[i], hm.get(prefix[i])+1);
            }
            else{
                hm.put(prefix[i],1);
            }
        }
        return result;

    }
    
}