// Solved Sep 1, 2025
// 4 wrong submissions
// 2-pointer solution. First points to 1st position, 2nd pointer points to non-zero elements. swap and iterate 1st pointer

class Solution {
    public void moveZeroes(int[] nums) {
        int y = 0;
        for(int x = 0; x < nums.length; x++){
            if (nums[x] != 0){
                int temp = nums[y];
                nums[y] = nums[x];
                nums[x] = temp;
                y++;
            }
        } 
    }
}