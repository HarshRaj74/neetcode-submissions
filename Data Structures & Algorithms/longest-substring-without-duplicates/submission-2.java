class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int current=0;
        int left=0;
        int right=0;
        HashMap<Character, Integer> hm=new HashMap<>();
        while (left<=right && right<s.length()){
            if(!hm.containsKey(s.charAt(right))||hm.get(s.charAt(right))<left){
                hm.put(s.charAt(right),right);
                current+=1;
                right+=1;
            }
            else{
                current=current-(hm.get(s.charAt(right))-left);
                left=Math.max(hm.get(s.charAt(right))+1,left);
                hm.put(s.charAt(right), right);
                right+=1;
            }
            max=(max>current)?max:current;
        }
        return max;
    }
}
