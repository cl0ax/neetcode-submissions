class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        HashMap<String, List<String>> res = new HashMap<>(); //mapping char count to list of anagrams
        for(int i = 0; i < strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sortedA = new String(charArr); 
            res.putIfAbsent(sortedA, new ArrayList<>());
            res.get(sortedA).add(strs[i]);
        }
        return new ArrayList<>(res.values());
    }

}
