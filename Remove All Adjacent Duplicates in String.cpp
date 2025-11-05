#include <string>

class Solution {
public:
    string removeDuplicates(string s) {
        std::vector<char> newStr(s.length());
        int index = -1;
        for(char c: s){
            if(index >= 0 && c == newStr[index]){
                index--;
            } else{
                newStr[++index] = c;
            }
        }
        string finalStr(newStr.begin(), newStr.begin()+index+1);
        return finalStr;
        
    }
};