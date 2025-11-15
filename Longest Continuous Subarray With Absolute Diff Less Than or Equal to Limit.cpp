class Solution {
public:
    int longestSubarray(vector<int>& nums, int limit) {
        deque<int> maxValues;
        deque<int> minValues;
        int l = 0, r;
        int maxLen = 0;
        for(r = 0; r < nums.size(); r++){
             while (!maxValues.empty() && nums[maxValues.back()] <= nums[r]){
                maxValues.pop_back();
            }
            maxValues.push_back(r);

            while (!minValues.empty() && nums[minValues.back()] >= nums[r]){
                minValues.pop_back();
            }
            minValues.push_back(r);
            
            while(nums[maxValues.front()] - nums[minValues.front()] > limit){
                l++;
                if(maxValues.front() < l){
                    maxValues.pop_front();
                }
                if(minValues.front() < l){
                    minValues.pop_front();
                }
            }
            maxLen = (r - l + 1) > maxLen ? (r - l + 1) : maxLen; 
        }
        return maxLen;
    }
};