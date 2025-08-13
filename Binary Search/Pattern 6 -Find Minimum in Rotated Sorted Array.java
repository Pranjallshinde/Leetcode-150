class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] > nums[high]) {
                // Minimum is in the right half
                low = mid + 1;
            } else {
                // Minimum is in the left half including mid
                high = mid;
            }
        }
        return nums[low];
    }
}
//Time Complexity (TC) → O(log n)
//Space Complexity (SC) → O(1)
