//Solved September 22 2025
//O(n) time complexity but still slower than many solutions
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int y = nums.length-1;
        int x = 0;
        while(x < y){
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
            y--;
            x++;
        }
        y = k-1;
        x = 0;
        while(x < y){
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
            y--;
            x++;
        }
        y = nums.length-1;
        x = k;
        while(x < y){
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
            y--;
            x++;
        }
    }
}