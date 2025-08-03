class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26]; // for 'a' to 'z'

        // Count frequency of each letter in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Try to construct ransomNote using letters from magazine
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) return false; // letter not available
            freq[c - 'a']--; // use one letter
        }

        return true;
    }
}
