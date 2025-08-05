class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>(); // s -> t
        HashMap<Character, Character> map2 = new HashMap<>(); // t -> s

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i); // from s
            char c2 = t.charAt(i); // from t

            // Check s → t mapping
            if(map1.containsKey(c1)) {
                if(map1.get(c1) != c2) return false;
            } else {
                map1.put(c1, c2);
            }

            // Check t → s mapping
            if(map2.containsKey(c2)) {
                if(map2.get(c2) != c1) return false;
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }
}
