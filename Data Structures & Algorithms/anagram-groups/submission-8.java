class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //signature, list of sig
        Map<String, List<String>> count = new HashMap<>();
        for(String str : strs){
            //turning it into a char arr to sort
            char[] arr = str.toCharArray();
            //sorting it = gives us the signature
            Arrays.sort(arr);
            //converting char to sig to save into hash
            String strSignature = new String(arr);

            //puts it if absent in hash/hasn't existed before alongside a new list to store strings that match
            count.putIfAbsent(strSignature, new ArrayList<>()); 

            //else - get the existing signature and add the str to the list
            count.get(strSignature).add(str);


        }
        //returns the list using the arrayList wrapper
        return new ArrayList<>(count.values());
    }
}
