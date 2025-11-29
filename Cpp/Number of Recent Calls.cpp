#include <queue>
class RecentCounter {
public:
    queue<int> calls;
    RecentCounter() {
        
    }
    
    int ping(int t) {
        calls.push(t);
        while(calls.front() + 3000 < t){
            calls.pop();
        }
        return calls.size();
    }
};
