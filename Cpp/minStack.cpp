#include <stack>
class MinStack {

public:
    stack<int> newStack;
    int min;
    MinStack() {
    }
    void push(int val) {
        if(newStack.empty()){
            min = val;
        } else if (val <= min){
            newStack.push(min);
            min = val;
        }
        newStack.push(val);
    }
    void pop() {
        if (newStack.empty()) return;
        int top = newStack.top();
        newStack.pop();
        if (top == min && !newStack.empty()) {
            min = newStack.top();
            newStack.pop();
        }
    }
    
    int top() {
        return newStack.top();
    }
    
    int getMin() {
        return min;
    }
};
