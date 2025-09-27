//Solved September 27 2025
//Needs to be like 1ms faster to not be in bottom 5%
import java.util.HashMap;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer,Integer> numOfNums = new HashMap<>();
        for(int x: nums){
            try{
                numOfNums.put(x,numOfNums.get(x)+1);
            }catch(NullPointerException e){
                numOfNums.put(x,1);
            }
        }
        for (Integer i : numOfNums.values()) {
            goodPairs += i*(i-1)/2;
        }
        return goodPairs;
    }
}