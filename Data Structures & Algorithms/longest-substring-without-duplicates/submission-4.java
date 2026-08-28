class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int current=0;
        int left=0;
        int right=0;
        HashMap<Character, Integer> hm=new HashMap<>();
        while (left<=right && right<s.length()){
            Character ch=s.charAt(right);
            if(!hm.containsKey(ch)||hm.get(ch)<left){
                hm.put(ch,right);
                current+=1;
                right+=1;
            }
            else{
                int temp=hm.get(ch);
                current=current-(temp-left);
                left=Math.max(temp+1,left);
                hm.put(ch, right);
                right+=1;
            }
            max=(max>current)?max:current;
        }
        return max;
    }
}
