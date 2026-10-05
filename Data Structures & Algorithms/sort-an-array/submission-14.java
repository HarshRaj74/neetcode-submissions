//insertion sort
class Solution{
    public int[] sortArray(int[] nums){
        int n=nums.length;
        int j=0;
        for(int i=1;i<n;i++)
        {
            int curr=nums[i];
            j=i-1;
            while(j>=0 && nums[j]>curr ){
                nums[j+1]=nums[j];
                j-=1;
            }
            nums[j+1]=curr;
        }
        return nums;
    }

}


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