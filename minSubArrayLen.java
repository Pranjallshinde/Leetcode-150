class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;//infinity

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1); //r - l + 1 is the current window size
                sum -= nums[left]; //shrink the window size
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen; //if no such array was found return 0 or else return the min length found
    }
}
