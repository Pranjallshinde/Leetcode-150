class Solution {
    public int removeDuplicates2(int[] nums) {
        int k = 2;// allows first two elements
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i]; //store only if not more than two duplicates
                k++;
            }
        }
        return k;
    }
}
