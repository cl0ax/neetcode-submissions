class Solution {
    /*
    Attempt #2
    - tried to implement the length-prefix approach
    - different from attempt #1, where my encoding solution was flawed and decode was well
    */
    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        //iterate the list to encode
        String encodeStr = "";
        for( String str : strs ){
            encodeStr += str.length() + "#" + str;
        } //encoding it into a single string
        return encodeStr;
    }

    public List<String> decode(String str) {
        //i plan on using split ot decode it into a list of lists again
        String[] parts; 
        int i = 0;
        while( i < str.length() ) {
            char c = str.charAt(i);
            if( c == '#'){
                int length = Integer.parseInt(c);
            }
            parts.add(str.subtring(str.charAt(i + 1), length));
            i++;
        }
        List<String> list = new ArrayList<>(Arrays.asList(parts));
        return list;
    }
}
