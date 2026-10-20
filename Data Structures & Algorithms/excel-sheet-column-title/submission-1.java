//number+64 is the character
class Solution {
    public String convertToTitle(int columnNumber) {
     StringBuilder sb=new StringBuilder();
     char character=0;
     while(columnNumber>0){
        columnNumber--;
        character=(char)((columnNumber%26)+65);
        sb.append(character);
        columnNumber/=26;
        }   
    return sb.reverse().toString();
    }   
}