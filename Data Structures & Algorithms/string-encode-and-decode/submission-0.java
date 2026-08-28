class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb=new StringBuffer();
        String ch="#";
        for(String str:strs){
            sb.append(str.length())  // Append integer length directly
              .append('#')           // Append delimiter after length
              .append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int wordLen=0;
            int hashIndex = str.indexOf('#', i);
            
            // Parse length from digits preceding '#'
            int length = Integer.parseInt(str.substring(i, hashIndex));
            
            // Move index past '#'
            i = hashIndex + 1;
            
            // Extract original string using length
            result.add(str.substring(i, i + length));
            
            // Advance index past the extracted word
            i += length;
        }

        return result;
    }
}
