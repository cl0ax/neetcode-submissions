//Brute Force Method | O(n^2)

class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag = false;

        int s_length = s.length();
        int t_length = t.length();

        if(s_length != t_length){
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for(int i = 0; i < charArray1.length; i++){
            for(int j = i; j < charArray2.length; j++){
                if(charArray1[i] == charArray2[j]){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
        }
    return flag;
    }
}        

