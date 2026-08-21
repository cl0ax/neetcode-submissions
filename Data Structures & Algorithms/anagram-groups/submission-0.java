class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        System.out.printf("hi");
        List<List<String>> groupAna = new List<>();
    
        for(int i = 0; i < strs.length; i++){
            for(int j = i + 1; j < strs.length; j++){
                Arrays.sort(strs[i]);
                Arrays.sort(strs[j]);
                if(strs[i] == strs[j]){
                    groupAna.add([strs[i], strs[j]]);
                }
            }
        }
    }
}
