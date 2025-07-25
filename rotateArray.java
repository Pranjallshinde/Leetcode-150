class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle k > n

        reverse(nums, 0, n - 1);       // step 1
        reverse(nums, 0, k - 1);       // step 2
        reverse(nums, k, n - 1);       // step 3
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // swap
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
