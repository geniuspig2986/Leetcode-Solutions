#include <stack>
#include <unordered_map>
class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int, int> map;
        stack<int> numStack;
        int i = 0;
        for(int i: nums2){
            while(!numStack.empty() && numStack.top() < i){
                map.insert({numStack.top(), i});
                numStack.pop();
            }
            numStack.push(i);

        }
        vector<int> result(nums1.size());
        for (int i = 0; i < nums1.size(); i++) {
            auto it = map.find(nums1[i]);
            if (it != map.end()) {
                result[i] = it->second;
            } else{
                result[i] = -1;
            }
        }
        return result;
    }
};