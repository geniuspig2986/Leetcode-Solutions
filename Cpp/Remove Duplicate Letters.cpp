#include <vector>
class Solution {
public:
    string removeDuplicateLetters(string s) {
        int lastOccurrence[26];
        int i;
        for (i = 0; i < s.length(); i++) {
            lastOccurrence[s[i] - 'a'] = i;
        }
        bool inArray[26];
        std::vector<char> result(s.length());
        int stackPointer = 0;
        for(i = 0; i < s.length(); i++){
            char current = s[i];
            if (inArray[current - 'a']) continue;
            while (stackPointer > 0 && result[stackPointer - 1] > current && 
                lastOccurrence   [result[stackPointer - 1] - 'a'] > i) {
                inArray[result[--stackPointer] - 'a'] = false;
            }
            
            result[stackPointer++] = current;
            inArray[current - 'a'] = true;
        }
        return string(result.begin(), result.begin() + stackPointer);
    }
};