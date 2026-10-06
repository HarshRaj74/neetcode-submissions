//ms re
class Solution{
    public int[] sortArray(int[] nums){
        ms(0, nums.length-1, nums);
        return nums;
    }
    public void ms(int l, int r, int[] a){
        if(r==l){
            return;
        }
        int m=l+(r-l)/2;
        ms(l,m,a);
        ms(m+1,r,a);
        m(l,m,r,a);    
    }
    public void m(int left, int mid, int right, int[] nums){
        int leftL=mid+1-left;
        int rightL=right-mid;
        int[] leftA=new int[leftL];
        int[] rightA=new int[rightL];
        int i=0;
        int j=0;
        while(i<leftL){
            leftA[i]=nums[left+i];
            i++;
        }
        i=0;
        while(j<rightL){
            rightA[j]=nums[mid+1+j];
            j++;
        }
        j=0;

        int p=left;
        while(p<=right && (i<leftL && j<rightL)){
            if(leftA[i]<=rightA[j]){
                nums[p]=leftA[i];
                i++;
            }
            else{
                nums[p]=rightA[j];
                j++;
            }
            p++;
        }
        while(i<leftL){
            nums[p]=leftA[i];
            i++;
            p++;
        }
        while(j<rightL){
            nums[p]=rightA[j];
            j++;
            p++;
        }
    }
}

//merge short
// class Solution{
//     public int[] sortArray(int[] nums){
//         mergesort(0, nums.length-1, nums);
//         return nums;
//     }
//     public void merge(int left, int right, int mid, int[] nums){
//         int leftlimit=mid-left+1;
//         int rightlimit=right-mid;
//         int[] leftarr=new int[leftlimit];
//         int[] rightarr=new int[rightlimit];
//         for(int i=0;i<leftlimit;i++){
//             leftarr[i]=nums[i+left];
//         }
//         for(int j=0;j<rightlimit;j++){
//             rightarr[j]=nums[j+mid+1];
//         }
//         int pointer=left;
//         int leftpointer=0;
//         int rightpointer=0;
//         while(pointer<=right && (leftpointer<leftlimit && rightpointer< rightlimit)){
//             if(leftarr[leftpointer]>=rightarr[rightpointer]){
//                 nums[pointer]=rightarr[rightpointer];
//                 rightpointer++;
//             }
//             else{
//                 nums[pointer]=leftarr[leftpointer];
//                 leftpointer++;
//             }
//             pointer++;
//         }
//         while(leftpointer<leftlimit){
//             nums[pointer]=leftarr[leftpointer];
//             pointer++;
//             leftpointer++;;
//         }
//         while(rightpointer<rightlimit){
//             nums[pointer]=rightarr[rightpointer];
//             pointer++;
//             rightpointer++;
//         }


//     }

//     public void mergesort(int left, int right, int[] nums){
//         if(left>=right){
//             return;
//         }
//         int mid=left+(right-left)/2;
//         mergesort(left,mid,nums);
//         mergesort(mid+1,right,nums);
//         merge(left, right, mid, nums);
//     }
// }

// //bubble sort
// //bubble sort at each iteration finds max and bubbles to the end
// //so outer loop must run n-1 times
// //inner loop n-i
// class Solution{
//     public int[] sortArray(int[] nums){
//         int n=nums.length;
//         int temp=0;
//         for(int i=1; i<n;i++){
//             boolean swapped=false;
//             for(int j=0;j<n-i;j++){
//                 if(nums[j]>nums[j+1]){
//                     temp=nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                     swapped=true;
//                 }
//             }
//             if(!swapped){
//                 return nums;
//             }
//         }
//         return nums;
//     }
// }
// //insertion sort
// class Solution{
//     public int[] sortArray(int[] nums){
//         int n=nums.length;
//         int j=0;
//         for(int i=1;i<n;i++)
//         {
//             int curr=nums[i];
//             j=i-1;
//             while(j>=0 && nums[j]>curr ){
//                 nums[j+1]=nums[j];
//                 j-=1;
//             }
//             nums[j+1]=curr;
//         }
//         return nums;
//     }

// }


// //selection short v2
// class Solution {
//     public int[] sortArray(int[] nums){
//         int len=nums.length;
//         int temp;
//         for(int i=0; i<len; i++){
//             int max_index=len-i-1;
//             for(int j=0;j<len-i;j++){
//                 if(nums[j]>nums[max_index]){
//                     max_index=j;
//                 }
//             }
//             temp=nums[len-i-1];
//             nums[len-i-1]=nums[max_index];
//             nums[max_index]=temp;
//         }
//         return nums;
//     }
// }


// //selection sort
// class Solution {
//     public int[] sortArray(int[] nums) {
//         int length=nums.length;
//         int temp;
//         int index_for_max=0;
//         for(int i=length-1; i>0;i--){
//             index_for_max=i;
//             for(int j=0;j<i;j++){
//                 if(nums[j]>nums[index_for_max]){
//                     index_for_max=j;
//                 }
//                 else{
//                     continue;
//                 }
                

//             }
//             temp=nums[i];
//             nums[i]=nums[index_for_max];
//             nums[index_for_max]=temp;
//         }
//     return nums;
//     }
// }