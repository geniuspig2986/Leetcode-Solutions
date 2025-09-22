//Solved September 19
//Hashmap optimal solution. Gonna try in C after learning how to make hashmaps
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        HashMap<Integer,Integer> seen = new HashMap<Integer,Integer>(); 
        for(int x = 0; x < nums.length; x++){
            if(seen.containsKey(target-nums[x])){
                results[0] = x;
                results[1] = seen.get(target-nums[x]);
                return results;
            }
            else{
                seen.put(nums[x],x);
            }
        }
        return results;
    }
}