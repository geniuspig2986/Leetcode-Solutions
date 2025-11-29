#include <stack>
class Solution {
public:
    bool find132pattern(vector<int>& nums) {
        if(nums.size() < 3){
            return false;
        }
        stack<int> st;
        int x;
        int third = -2147483648;
        for(x = nums.size()-1; x >= 0; x--){
            if(nums[x] < third){
                return true;
            }
            while(!st.empty() && st.top() < nums[x]){
                third = st.top();
                st.pop();
            }
            st.push(nums[x]);
        }
        return false;
    }
};