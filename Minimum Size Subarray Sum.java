//solved October 18 2025
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = nums.length+1;
        int start = 0;
        int curSum = 0;
        int totalSum = 0;
        for(int end = 0; end < nums.length; end++){
            curSum += nums[end];
            while(curSum >= target){
                minLength = Math.min(minLength, (end - start + 1));
                curSum -= nums[start];
                start++;
            }
        }
        if(minLength == nums.length+1){
            return 0;
        }
        return minLength;
    }
}