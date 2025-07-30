class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        //int[] ans = new int[2];we can do by declaring ans at the start also

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[] {left + 1, right + 1};
            }
            if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1 , -1};
    }
}
