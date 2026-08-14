//Sorting Method
//Time Complexity: O(nlogn+mlogm)
//Space Complexity: O(1) or O(n+m)
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag = false;
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        return Arrays.equals(charArrayS, charArrayT);
    }
}
