class Solution {
    public int jump(int[] nums) {
        int farthest = 0; //The farthest index we can reach in the current jump window.
        int jumps = 0; // Count of jumps taken.
        int currEnd = 0; // End of the current jump window.

        for(int i = 0; i < nums.length - 1; i++){
            farthest = Math.max(farthest , nums[i] + i);
        
            if(i == currEnd){ //time to jump
                currEnd = farthest;
                jumps++;
            }
        }return jumps;
    }
}
