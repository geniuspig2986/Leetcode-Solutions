#include <stack>
class Solution {
public:
    vector<int> canSeePersonsCount(vector<int>& heights) {
        int i;
        vector<int> res(heights.size());
        stack<int> st;
        for(i = heights.size()-1; i >= 0; i--){
            while(!st.empty() && heights[st.top()] < heights[i]){
                st.pop();
                res[i]++;
            }
            if(!st.empty()){
                res[i]++;
            }
            st.push(i);
        }
        return res;
    }
};