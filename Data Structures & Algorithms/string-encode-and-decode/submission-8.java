class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for(String str : strs){
            encoded_string += str.length() + '#' + str;
        }
        return encoded_string;
    }

    public List<String> decode(String str) {
        String decoded_string = "";
        int length = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                length = Character.getNumericValue(c);
            }
            decoded_string += Integer.parseInt(s.substring(i, length))
        }
        return decoded_string;
    }
}
