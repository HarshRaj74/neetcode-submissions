class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int c;
        int[] o=new int[2];
        while(l<r){
            c=numbers[l]+numbers[r];
            if(c==target){
                o[0]=l+1;
                o[1]=r+1;
                break;
            }
            else if(c<target){
                l+=1;
            }
            else{
                r-=1;
            }
        }
        return o;
    }
}
