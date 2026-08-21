class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for(String str : strs){
            int length = str.length();
            encodedStr += length + '#' + str;
        }
        return encodedStr;

    } 

    public List<String> decode(String str) {
        String decodedStr = "";
        List<String> strs = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if( str.charAt(i) == '#' ){
                int size = Integer.parseInt(str.substring(i -1, i));
                strs.add(str.substring( i + 1, size));
            }
        }

        return strs; 
    }
}
