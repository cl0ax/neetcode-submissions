class Solution {

    public String encode(List<String> strs) {
        String str1 = "";
        for(String str : strs) {
            //StringBuilder sb = new StringBuilder();
            int len = str.length();
            //str.append("#" + len + strs[i];)
            str1 += len + "#"  + str; 
            
            
        }   
        return str1; 
    }
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0; 
        while( i < str.length() ){
            for(int j = i; j < str.length(); j++){
                char c = str.charAt(j);
                if( c == '#') {
                    int len = Integer.parseInt(str.substring(i, j));
                    result.add(str.substring(j + 1, j + len + 1));
                    i = len + 1 + j; 
                    break;
                }
                
            }
        }
       return result;
    }
}
