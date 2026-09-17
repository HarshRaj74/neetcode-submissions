class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last=m+n-1;
        int lastArr1 = m-1;
        int lastArr2= n-1;
        //for loop to fill the n index ie starting from 0
        //have to do while loop as will have to iterate till the nums2 doesnt meet its end 
        //and pointer last will not be always iterated nums 2 times it can be for nums1 as 
        //well so that lastArr1 will go back and so while loop only control by nums2
        while(lastArr2>=0 && last!=lastArr2){
            if(nums2[lastArr2]>=nums1[lastArr1]){
                nums1[last]=nums2[lastArr2];
                last-=1;
                lastArr2-=1;
            }
            else{
                nums1[last]=nums1[lastArr1];
                last-=1;
                lastArr1-=1;
            }
        }
        if(last==lastArr2 && lastArr2!=-1){
            for(int j=0;j<=lastArr2;j++){
                nums1[j]=nums2[j];
            }
        }
        

    }
}