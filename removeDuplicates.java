class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0;  // j points to the last unique index

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;  // move j forward
                nums[j] = nums[i];  // copy unique value
            }
        }

        return j + 1;  // number of unique elements
    }
}
