class Solution {
    public boolean isPalindrome(String s) {
        String text="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(text.indexOf(s.charAt(left))<0){
                left+=1;
                continue;
            }
            if(text.indexOf(s.charAt(right))<0){
                right-=1;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }

}
