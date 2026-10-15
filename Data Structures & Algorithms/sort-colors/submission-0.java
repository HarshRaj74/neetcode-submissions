class Solution {
    public void sortColors(int[] nums) {
        int cr=0;
        int cw=0;
        int cb=0;
        for(int i:nums){

            if(i==0){
                cr++;
            }
            else if(i==1){
                cw++;
            }
            else{
                cb++;
            }

        }
        int pointer=0;
        while(cr!=0){
            nums[pointer]=0;
            pointer++;
            cr--;
        }
        while(cw!=0){
            nums[pointer]=1;
            pointer++;
            cw--;
        }
        while(cb!=0){
            nums[pointer]=2;
            pointer++;
            cb--;
        }
    }
}