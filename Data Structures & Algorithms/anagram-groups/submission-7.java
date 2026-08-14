class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map< String, List<String> > res = new HashMap<>();

        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String strSignature = new String(charArr);

            res.putIfAbsent(strSignature, new ArrayList<>());

            res.get(strSignature).add(str);

        }
        return new ArrayList<>(res.values());
    }
}
//warm up - 7 ish minutes
