class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // found target
            } else if (nums[mid] < target) {
                low = mid + 1; // move right
            } else {
                high = mid - 1; // move left
            }
        }
        return low; // insertion position
    }
}
