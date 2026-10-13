class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm=new HashMap<>();
        List<List<String>> output=new ArrayList<>();
        String sorted;
        for(String s: strs){
            char[] ca=s.toCharArray();
            Arrays.sort(ca);
            sorted=new String(ca);
            if(!hm.containsKey(sorted)){
                hm.put(sorted,new ArrayList());
            }
            hm.get(sorted).add(s);
            
        }
        for(List<String> values: hm.values()){
            output.add(values);
        }
        return output;
    }
}
