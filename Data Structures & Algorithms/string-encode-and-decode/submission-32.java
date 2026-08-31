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
        List<String> result = new List<>();
        int i = 0; 
        while( i < str.length() ){
            int j = i + 1; 
            if( !Character.isLetterOrDigit(c) ){
                i = j; 
            }
            j++;
        }
       //Sure. This is my solution attempt after taking a look at the already passed submission where were but yeah. Maybe it's a friend so it's not I'm not really spending too much time on this really anything like that, so 
    }
}
