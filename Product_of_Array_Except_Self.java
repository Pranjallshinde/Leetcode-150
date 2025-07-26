class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] answer = new int[n];

        int proLeft = 1;
        int proRight = 1;

        for(int i = n - 1; i >= 0; i--){
            answer[i] = proRight;
            proRight *= nums[i];
        }

        for(int i = 0; i < n; i++){
            answer[i] = answer[i] * proLeft;
            proLeft *= nums[i];
        }
        return answer;
    }
}
