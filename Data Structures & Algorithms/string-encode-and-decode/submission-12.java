class Solution {

    public String encode(List<String> strs) {
        String encStr = "";
        for(String str : strs){
            encStr += str.length() + "#" + str;
        }
        return encStr;
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> strs = new ArrayList<>();
        while( i < str.length()){
            for(int j = i; j < str.length(); j++){
                char c = str.charAt(j);
                if(c == '#'){
                    int len = Integer.parseInt(str.substring(i, j)); 
                    strs.add(str.substring(j + 1, j + len + 1));
                    i = j + len + 1; 
                    break;
                }
            }
        }
        return strs;
    }
}
