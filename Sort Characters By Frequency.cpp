#include <unordered_map>
class Solution {
public:
    string frequencySort(string s) {
        unordered_map<char, int> freqMap;
        for(char c: s){
            freqMap[c]++;
        }
        int maxFrequency = s.size();
        vector<vector<int>> buckets(maxFrequency+1);
         for (auto &entry : freqMap) {
            char c = entry.first;
            int frequency = entry.second;
            buckets[frequency].push_back(c);
        }
        string sb;
        sb.reserve(s.size());
        for (int i = maxFrequency; i > 0; --i) {
            if (!buckets[i].empty()) {
                for (char c : buckets[i]) {
                    for (int j = 0; j < i; ++j) {
                        sb.push_back(c);
                    }
                }
            }
        }
        return sb;
    }
};