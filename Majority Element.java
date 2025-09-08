//Solved Aug 20 2025
//William Chenyin was on call with me

import java.util.Hashtable;
class Solution {
    Hashtable<Integer,Integer> freq = new Hashtable<>();
    public int majorityElement(int[] nums) {
        for (int x: nums){
            freq.put(x, freq.getOrDefault(x,0)+1);
            if (freq.get(x) > nums.length/2){
                return x;
            }
        }
        return 0;
    }
}