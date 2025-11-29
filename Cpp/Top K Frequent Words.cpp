class Solution {
public:
    vector<string> topKFrequent(vector<string>& words, int k) {
        unordered_map<string, int> wordFreq;
        for(const string& s: words){
            wordFreq[s]++;
        }
        vector<string> buckets;
        buckets.reserve(wordFreq.size());
        for(const auto& entry : wordFreq){
            buckets.push_back(entry.first);
        }
        sort(buckets.begin(),buckets.end(),
            [&](const string& w1, const string& w2) {
                 if (wordFreq[w1] == wordFreq[w2]) {
                     return w1 < w2;
                 } else {
                     return wordFreq[w1] > wordFreq[w2];
                 }
            });
        return vector<string>(buckets.begin(), buckets.begin() + k);
    }
};