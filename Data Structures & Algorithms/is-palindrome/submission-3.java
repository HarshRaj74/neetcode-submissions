class Solution {
    public boolean isPalindrome(String s) {

        // using ascii character range 65-90,97-122, 48-57
        int left =0;
        int right=s.length()-1;
        while(left<right){
            char leftChar=s.charAt(left);
            char rightChar=s.charAt(right);
            boolean leftVal=(leftChar >=65 && leftChar<=90 )||(leftChar >=97 && leftChar<=122)||(leftChar>=48 && leftChar<=57);
            boolean rightVal=(rightChar >=65 && rightChar<=90 )||(rightChar >=97 && rightChar<=122)||(rightChar>=48 && rightChar<=57);
            if(!leftVal ){
                left+=1;
                continue;
            }
            if(!rightVal){
                right-=1;
                continue;
            }
                if(Character.toLowerCase(leftChar)==Character.toLowerCase(rightChar)){
                    left++;
                    right--;
                    continue;
                }
                else{
                    return false;
                }
            }
        
        return true;
    }

}
