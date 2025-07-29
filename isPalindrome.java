class Solution {
    public boolean isPalindrome(String s) {
        int st = 0;                      // pointer from start
        int end = s.length() - 1;        // pointer from end

        while (st < end) {
            // Skip non-alphanumeric characters from the front
            if (!Character.isLetterOrDigit(s.charAt(st))) {
                st++;
                continue;
            }

            // Skip non-alphanumeric characters from the back
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            // Compare characters in lowercase (ignore case)
            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;  // mismatch found → not a palindrome
            }

            // Move both pointers inward
            st++;
            end--;
        }

        return true;  // all characters matched → valid palindrome
    }
}
