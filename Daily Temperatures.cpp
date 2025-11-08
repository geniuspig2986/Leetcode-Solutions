#include <stack>
class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        stack<int> numStack;
        int i;
        vector<int> result(temperatures.size());
        for(i = 0; i < temperatures.size(); i++){
            while(!numStack.empty() && temperatures[numStack.top()] < temperatures[i]){
                int index = numStack.top();
                numStack.pop();
                result[index] = i - index;
            }
            numStack.push(i);
        }
        return result;
    }
};