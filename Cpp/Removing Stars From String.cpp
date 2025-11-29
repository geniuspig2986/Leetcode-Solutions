#include <vector>
class Solution {
public:
    string removeStars(string s) {
        std::vector<char> result(s.length());
        int i = 0;
        for(char c: s){
            if(c == '*'){
                i--;
            } else{
                result[i] = c;
                i++;
            }
        }
        return string(result.begin(), result.begin() + i);
    }
};