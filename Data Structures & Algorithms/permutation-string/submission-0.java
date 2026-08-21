class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        boolean flag = true;
        HashMap<Character, Integer> s1_window = new HashMap<>();
        if(s2.length() < s1.length()){
            flag = false;
        }

        //creating freq count for s1
        for(int right = 0; right < s1.length(); right++ ){
            char c = s1.charAt(right);
            s1_window.put(c, s1_window.getOrDefault(c, 0) + 1);
        }
        
        int l2 = 0;
        HashMap<Character, Integer> s2_window = new HashMap<>();
        for(int r2 = 0; r2 < s2.length(); r2++){
            char c2 = s2.charAt(r2);
            s2_window.put(c2, s2_window.getOrDefault(c2, 0) + 1);

            while( s2_window.size() > s1_window.size() ){

                flag = false;
                s2_window.put(s2.charAt(l2), s2_window.getOrDefault(s2.charAt(l2), 0) - 1);
                s2_window.remove(s2.charAt(l2));
                l2++;
            }
        }

        // Collections.sort(s1_window);
        // Collections.sort(s2_window);

        // for(int i = 0; i < s1.length(); i++){
        //     while(i < s1.length()){
        //         if(s2_window.get(i) == s1_window.get(i)){
        //             flag = true;
        //         }
        //     }
        // }
        System.out.println(s1_window.size());
        System.out.println(s2_window.size());
        return flag;
    }
}
