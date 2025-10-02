//Solved October 10 20205
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int x = 0;
        int y = numbers.length-1;
        int sum = numbers[x]+numbers[y];
        while(sum != target){
            if(sum < target){
                x++;
            }
            if(sum > target){
                y--;
            }
            sum = numbers[x]+numbers[y];
        }
        int[] ans = {x+1,y+1};
        return ans;
    }
}