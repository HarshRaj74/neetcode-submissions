class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<Character>  a=new ArrayList<>();
        boolean mismatch=false;
        int len=strs[0].length();
        for(int i=0; i<len;i++){
            char candidate=strs[0].charAt(i);
            if(mismatch) break;
            for(int j=1; j<strs.length;j++){
                if((strs[j].length() <i+1) || (strs[j].charAt(i)!=candidate)){
                    mismatch=true;
                    break;
                }
            }
            if(!mismatch) a.add(candidate);
        }
        return a.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}