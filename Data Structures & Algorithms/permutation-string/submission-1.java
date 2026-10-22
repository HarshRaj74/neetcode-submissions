class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int i=0;
        int j=s1.length()-1;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        boolean result=false;
        while(i<=j){
            freq1[s1.charAt(i)-'a']+=1;
            i++;
        }
        i=0;
        while(i<=j){
            freq2[s2.charAt(i)-'a']+=1;
            i++;
        }
        i=0;
        while(j<s2.length()){
            result=true;
            for(int k=0; k<26; k++){
                if(freq1[k]!=freq2[k]){
                    result=false;
                    break;
                }
            }
            if(result==true){
                break;
            }
            if(j<s2.length()-1){
            i+=1;
            j+=1;
            freq2[s2.charAt(i-1)-'a']-=1;
            freq2[s2.charAt(j)-'a']+=1;
            }
            else{
                break;
            }
        }
        return result;
    }
}
