class Solution {

    public String encode(List<String> strs) {
        
        for(String str : strs) {
            //StringBuilder sb = new StringBuilder();
            int len = str.length();
            //str.append("#" + len + strs[i];)
            str += "#" + len + str; 
        }
        return str; 
    }

    public List<String> decode(String str) {

    }
}
