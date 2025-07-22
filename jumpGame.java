class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0; //This is the maximum index I can reach so far.
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i > maxReach){
              return false;  
            }
            maxReach = Math.max(maxReach, i + nums[i]);  
        }
        return true;
    }
}
