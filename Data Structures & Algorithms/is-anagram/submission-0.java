class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char a:s.toCharArray()){
            arr1[a-97]+=1;
        }
        for(char b:t.toCharArray()){
            arr2[b-97]+=1;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
