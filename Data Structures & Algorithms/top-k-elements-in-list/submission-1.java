class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len=nums.length;
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        int[] output=new int[k];
        HashMap<Integer, Integer> count=new HashMap<Integer, Integer>();
        for(int i:nums){
            if(count.get(i)!=null){
                count.put(i,count.get(i)+1);
            }
            else{
                count.put(i,1);
            }
        }      
        for(int j:count.keySet()){
            bucket[count.get(j)].add(j);
        }
        int pointer=len;
        while(k>0){
            if(bucket[pointer].isEmpty()){
                pointer-=1;
            }
            else{
                output[k-1]=bucket[pointer].remove(bucket[pointer].size()-1);
                k-=1;
            }
        }
        return output;

    }
}
