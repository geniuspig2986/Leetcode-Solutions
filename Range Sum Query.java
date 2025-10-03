//Solved October 3 2025
class NumArray {
    private int[] sumArray;
    public NumArray(int[] nums) {
        sumArray = new int[nums.length+1];
        for(int x = 0; x < nums.length; x++){
            sumArray[x+1] = sumArray[x] + nums[x];
        }
    }
    
    public int sumRange(int left, int right) {
        return sumArray[right+1] - sumArray[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */