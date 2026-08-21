class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String stringSignature = new String(charArr);
            res.putIfAbsent(stringSignature, new ArrayList<>());
            res.get(stringSignature).add(str);
        }
        return res.values();
    }
}
