class Solution {

    public String encode(List<String> strs) {
        // if(strs.isEmpty()){
        //     return null;
        // }
        //iterate the list to encode
        String encodeStr = "";
        for( String str : strs ){
            encodeStr += str + "#";
        } //encoding it into a single string
        return encodeStr;
    }

    public List<String> decode(String str) {
        //i plan on using split ot decode it into a list of lists again
        String[] parts = str.split("#");
        List<String> list = new ArrayList<>(Arrays.asList(parts));
        return list;
    }
}
