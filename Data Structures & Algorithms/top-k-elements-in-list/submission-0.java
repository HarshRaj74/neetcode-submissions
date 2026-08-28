class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len=nums.length;
        ArrayList<ArrayList<Integer>> bucket=new ArrayList<>(len+1);
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
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }       
        for(int j:count.keySet()){
            bucket.get(count.get(j)).add(j);
        }
        int pointer=len;
        while(k>0){
            if(bucket.get(pointer).isEmpty()){
                pointer-=1;
            }
            else{
                output[k-1]=bucket.get(pointer).remove(bucket.get(pointer).size()-1);
                k-=1;
            }
        }
        return output;

    }
}
