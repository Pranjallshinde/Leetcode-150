//Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
       int currSum = nums[0];
       int maxSum = nums[0];

       for(int i = 1; i < nums.length; i++){
        // Check whether to:
        // 1. Extend the previous subarray (currSum + nums[i])
        // 2. Or start a new subarray from current element (nums[i])
        // We choose the one with the higher sum
        
        currSum = Math.max(nums[i] , currSum + nums[i]);
        maxSum = Math.max(currSum, maxSum);
       }
       return maxSum; 
    }
}
