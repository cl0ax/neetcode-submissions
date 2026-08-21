class Solution {
    /*
    Attempt #2
    - tried to implement the length-prefix approach
    - different from attempt #1, where my encoding solution was flawed and decode as well
    */

    //logic for the encoding parts seems correct
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
        String[] parts; //WRONG: should be a ArrayList - dynamic size is needed here, not fixed
        int i = 0;
        while( i < str.length() ) {
            char c = str.charAt(i);
            if( c == '#'){
                int length = Integer.parseInt(c); //WRONG: should be outside in loop level
            }
            parts.add(str.subtring(str.charAt(i + 1), length));//WRONG: char is not needed inside subtring, indexes are
            i++; //WRONG: we want to start at the next word
            // so we should jump = i + 1 + length
        }
        List<String> list = new ArrayList<>(Arrays.asList(parts));
        return list;
    }
    //ADDITIOINAL WRONG:
    //we do not consider 2 digits in this code, only 1
    //ex. "12#aaaaaaa"



    //NEXT TIME (think about):
    /*
    - List instead of array, 
    - digit-scan instead of single-char parse, 
    - the i jump

    THE PATTERN FOR NEXT TIME:
    scan digits 
        → parseInt 
            → grab length chars after # 
                → jump i past the word 
                    → repeat into a List.
    */
}
