// Solved Sep 05 2025

class Solution {
    public int removeDuplicates(int[] nums){
        int uniques = 1;
        int uniqueElement = nums[0];
        for(int x = 0; x < nums.length; x++){
            if(nums[x] > uniqueElement){
                nums[uniques] = nums[x];
                uniqueElement = nums[x];
                uniques++;
            }
        }
        return uniques;
    }
}
