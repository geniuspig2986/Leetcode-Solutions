//vector mimicking stack solution:
#include <vector>
class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        vector<int> polishStack(tokens.size());
        int index = 0;
        for(string s: tokens){
            if(s == "+"){
                polishStack[index-2] = polishStack[index-2] + polishStack[index-1];
                index--;
            }
            else if(s == "-"){
                polishStack[index-2] = polishStack[index-2] - polishStack[index-1];
                index--;

            }
            else if(s == "*"){
                polishStack[index-2] = polishStack[index-2] * polishStack[index-1];
                index--;

            }
            else if(s == "/"){
                polishStack[index-2] = polishStack[index-2] / polishStack[index-1];
                index--;
            } else{
                polishStack[index++] = stoi(s);
            }
        }
        return polishStack[0];
    }
};
//stack solution:
#include <stack>
class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        int s = 0;
        stack<int> polishStack;
        int result = 0;
        int top;
        for(string s: tokens){
            if(s == "+"){
                top = polishStack.top();
                polishStack.pop();
                result = top + polishStack.top();
                polishStack.pop();
                polishStack.push(result);
            }
            else if(s == "-"){
                top = polishStack.top();
                polishStack.pop();
                result = polishStack.top() - top;
                polishStack.pop();
                polishStack.push(result);
            }
            else if(s == "*"){
                top = polishStack.top();
                polishStack.pop();
                result = top * polishStack.top();
                polishStack.pop();
                polishStack.push(result);
            }
            else if(s == "/"){
                top = polishStack.top();
                polishStack.pop();
                result = polishStack.top() / top;
                polishStack.pop();
                polishStack.push(result);
            } else{
                polishStack.push(std::stoi(s));
            }
        }

        return polishStack.top();
    }
};