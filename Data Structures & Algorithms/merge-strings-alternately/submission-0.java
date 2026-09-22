class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int k=0;
        int len1=word1.length();
        int len2=word2.length();
        char[] output=new char[len1+len2];
        while(i<word1.length() && j<word2.length()){
            output[k++]=word1.charAt(i);
            output[k++]=word2.charAt(j);
            i+=1;
            j+=1;
        }
        if(i<word1.length()){
            while(i<word1.length()){
                output[k++]=word1.charAt(i);
                i+=1;
            }
        }
        if(j<word2.length()){
            while(j<word2.length()){
                output[k++]=word2.charAt(j);
                j+=1;
            }
        }
        return String.valueOf(output);
    }
}