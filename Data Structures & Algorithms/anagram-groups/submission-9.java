class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupAna = new HashMap<>();
        
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String s = new String(arr);

            if(groupAna.containsKey(s)){
                groupAna.get(s).add(str);
            }
            else{
                groupAna.put(s, new ArrayList<String>() );
                groupAna.get(s).add(str);
            }
        }
        return new ArrayList<>(groupAna.values());
    }
}
