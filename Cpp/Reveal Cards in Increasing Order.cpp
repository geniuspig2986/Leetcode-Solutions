//standard queue solution
class Solution {
public:
    vector<int> deckRevealedIncreasing(vector<int>& deck) {
        sort(deck.begin(), deck.end());
        queue<int> orderedDeck;
        int i;
        int front;
        for(i = deck.size() - 1; i >= 0; i--){
            if(!deck.empty()){
                front = orderedDeck.front();
                orderedDeck.pop();
                orderedDeck.push(front);
            }
            orderedDeck.push(deck[i]);
        }
        std::vector<int> res;
        while (!orderedDeck.empty()) {
            res.push_back(orderedDeck.front());
            orderedDeck.pop();
        }
        reverse(res.rbegin(), res.rend());
        return res;

    }
};
// using queue of indices
class Solution {
public:
    vector<int> deckRevealedIncreasing(vector<int>& deck) {
        sort(deck.begin(), deck.end());
        queue<int> q;
        int i;
        vector<int> res(deck.size());
        for(i = 0; i < deck.size(); i++){
            q.push(i);
        }
        for(i = 0; i < deck.size(); i++){
            res[q.front()] = deck[i];
            q.pop();
            if(!q.empty()){
                q.push(q.front());
                q.pop();
            }
        }
        return res;
    }
};