class Solution {
    public int find(int i, int j, int[]  heights){
       return (heights[j]>=heights[i])?(heights[i]*(j-i)):(heights[j]*(j-i)); 
    }
    public int maxArea(int[] heights) {
        //only move shorter line inwards
        int l=0;
        int r=heights.length-1;
        int max=find(l,r,heights);
        int curr=0;
        while(l<r){
            if(heights[l]<=heights[r]){
                l=l+1; 
            }
            else{
                r=r-1;
            }
            curr=find(l,r,heights);
            max=max>curr?max:curr;
        }
        return max;
    }
}
