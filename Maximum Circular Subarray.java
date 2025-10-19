class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int minSum = nums[0];
        int maxSum = nums[0];
        int totalSum = 0;
        int curSumMin = 0;
        int curSumMax = 0;
        for(int x = 0; x < nums.length; x++){
            curSumMin += nums[x];
            curSumMax += nums[x];
            totalSum += nums[x];
            minSum = Math.min(minSum,curSumMin);
            maxSum = Math.max(maxSum,curSumMax);
            if(curSumMin > 0){
                curSumMin = 0;
            }
            if(curSumMax < 0){
                curSumMax = 0;
            }
        }
        if(totalSum == minSum){
            return maxSum;
        }
        return Math.max(totalSum - minSum, maxSum);
    }
}