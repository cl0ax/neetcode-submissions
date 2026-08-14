class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for(String str : strs){
            encodedStr += str.length() + "#" + str;
        }
        return encodedStr;

    } 

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while( i < str.length()){
            for(int j = i; j < str.length(); j++){
                char c = str.charAt(j);
                if( c == '#' ){
                    int len = Integer.parseInt(str.substring(i, j));
                    i = j + 1;
                    strs.add(str.substring(i, i + len));

                    i = i + len;
                    break;
                }

            }
        }

        return strs; 
    }
}
