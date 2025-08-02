class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMin = nums[0];
        int minSum = nums[0];

        int currMax = nums[0];
        int maxSum = nums[0];

        int totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            totalSum += nums[i];

            // normal Kadane for max subarray
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            // inverted Kadane for min subarray
            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }

        // if all are negative numbers, no circular subarray is possible
        if (totalSum == minSum) {
            return maxSum; 
        }

        // otherwise, circular:
        return Math.max(maxSum, totalSum - minSum);
    }
}
