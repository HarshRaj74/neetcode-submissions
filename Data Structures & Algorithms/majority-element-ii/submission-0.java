class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int can1=0;
        int can2=0;
        int cnt1=0;
        int cnt2=0;
        int n=nums.length;
        for(int i:nums){
            if(i==can1){
                cnt1+=1;
            }
            else if(i==can2){
                cnt2+=1;
            }
            else if(cnt1==0){
                cnt1=1;
                can1=i;
            }
            else if(cnt2==0){
                cnt2=1;
                can2=i;
            }
            else{
                cnt1-=1;
                cnt2-=1;
            }
        }
        cnt1=cnt2=0;
        for(int j:nums){
            if(j==can1){
                cnt1++;
            }
            else if(j==can2){
                cnt2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (cnt1 > n / 3) res.add(can1);
        if (cnt2 > n / 3) res.add(can2);

        return res;
    }
}