class Solution {
    /*
    Attempt #3:
    - 
    */
    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        String encodeStr = "";
        for( String str : strs ){
            encodeStr += str.length() + "#" + str;
        }
        return encodeStr;
    }

    public List<String> decode(String str) {
        ArrayList<String> parts = new ArrayList<>(); 
        int i = 0;
        while( i < str.length() ) {
            for(int j = i; j < str.length(); j++){
                char c = str.charAt(j);
                if( c == '#' ){
                    int len = Integer.parseInt(str.substring(i, j));
                    //the jump
                    i = j + 1;
                    parts.add(str.substring(i, i + len));
                    i = i + len;
                    break;
                }
            }
        }
        return parts;
    }
}
    //     
    //     return list;