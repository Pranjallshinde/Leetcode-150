
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0;
        int minLen = Integer.MAX_VALUE; // acts as infinity
        int n = nums.length;

        while (right < n) {
            sum += nums[right];

            // shrink the window while sum ≥ target
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1); // current window size
                sum -= nums[left];
                left++;
            }

            right++;
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen; // if no such sub Array is present return 0
    }
}


