class Solution {

    public String encode(List<String> strs) {
        String str1 = "";
        for(String str : strs) {
            //StringBuilder sb = new StringBuilder();
            int len = str.length();
            //str.append("#" + len + strs[i];)
            str += "#" + len + str; 
            str1 = str;
            
        }   
        return str1; 
    }
    public List<String> decode(String str) {
        
    }
}
