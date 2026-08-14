class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String stringSignature = new String(charArr);
            res.putIfAbsent(stringSignature, new ArrayList<>());

            /*
            (1) .put(str) vs .add(str
                why it doesn't work: 
                    I was using a Map method (.put) on a List (it's add for lists)
                before fix:
                    res.get(stringSignature).put(str);
            */
            res.get(stringSignature).add(str);
        }
        /*
        (2) res.values() vs new ArrayList<>(res.values())
            why it didn't work:
                it returned a collection, NOT a list (as per the method signature)
            before the fix:
                return res.values();
        */
        return new ArrayList<>(res.values());
    }
}
