class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(int i = 0; i < strs.size(); i++) {
            int len = str.length; 
            str = "#" + len + strs[i];
        }
    }

    public List<String> decode(String str) {

    }
}
