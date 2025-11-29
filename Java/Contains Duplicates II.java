//solved September 30 2025
import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for(int x = 0; x < nums.length; x++){
            if(x > k){
                window.remove(nums[x-k-1]);
                window.add(nums[x]);
                if(window.size() < k+1){
                    return true;
                }
            } else{
                window.add(nums[x]);
                if(window.size() < x+1){
                    return true;
                }
            }
        }
        return false;

    }
}