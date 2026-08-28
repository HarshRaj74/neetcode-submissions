//merge sort
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(0, nums.length -1 ,nums);
        return nums;
    }
    public void mergeSort(int left, int right, int[] nums){
        if (left >= right) {
        return;
         }
        int mid =(left+right)/2;
        mergeSort(left, mid, nums);
        mergeSort(mid+1, right , nums);
        merge(left, mid, right, nums);
    }
    public void merge(int left, int mid, int  right, int[] nums){
        int leftLen=mid-left+1;
        int rightLen=right-mid;
        int[] leftarr=new int[leftLen];
        int[] rightarr=new int[rightLen];
        for(int i=0;i<leftLen;i++){
            leftarr[i]=nums[left+i];
        }
        for(int j=0;j<rightLen;j++){
            rightarr[j]=nums[mid+j+1];
        }
        int pointer=left;
        int leftpointer=0;
        int rightpointer=0;
        while(pointer<=right && (leftpointer<leftLen && rightpointer<rightLen )){
            if(leftarr[leftpointer]<=rightarr[rightpointer]){
                nums[pointer]=leftarr[leftpointer];
                leftpointer+=1;
            }
            else{
                nums[pointer]=rightarr[rightpointer];
                rightpointer+=1;
            }
            pointer+=1;

        }
        if(leftpointer<leftLen){
            while(leftpointer != leftLen){
                nums[pointer]=leftarr[leftpointer];
                pointer+=1;
                leftpointer+=1;
            }
        }
        if(rightpointer<rightLen){
            while(rightpointer != rightLen){
                nums[pointer]=rightarr[rightpointer];
                pointer+=1;
                rightpointer+=1;
            }
        }
    }
}