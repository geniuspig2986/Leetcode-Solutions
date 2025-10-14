
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double curSum = 0.0;
        for(int x = 0; x < k; x++){
            curSum += nums[x];
        }
        double maxAverage = curSum/k;
        for(int x = k; x < nums.length; x++){
            curSum -= nums[x-k];
            curSum += nums[x];
            if(maxAverage < curSum/k){
                maxAverage = curSum/k;
            }
        }
        return maxAverage;
    }
}