class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){ //length is the first thing to check 
            return false; 
        }
        char[] s_ana = s.toCharArray();  //converting s and t strings into char arrays 
        char[] t_ana = t.toCharArray();  
        
        Arrays.sort(s_ana); //should be the same after sorting
        Arrays.sort(t_ana);

        return Arrays.equals(s_ana, t_ana); //returns true/false
    }
}