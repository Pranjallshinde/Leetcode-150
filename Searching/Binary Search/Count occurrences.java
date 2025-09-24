//Time Complexity: O(log n)
//Space Complexity: O(1)
 
class Solution {
    // Find first occurrence
    private int firstOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1; // look left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Find last occurrence
    private int lastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1; // look right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Count occurrences
    public int countOccurrences(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        if (first == -1) return 0; // target not found
        int last = lastOccurrence(nums, target);
        return last - first + 1;
    }
}
