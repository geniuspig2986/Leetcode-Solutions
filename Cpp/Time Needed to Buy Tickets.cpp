class Solution {
public:
    int timeRequiredToBuy(vector<int>& tickets, int k) {
        int total = 0;
        int i;
        for(i = 0; i < tickets.size(); i++){
            if(i <= k){
                total += tickets[i] < tickets[k] ? tickets[i] : tickets[k];
            }else{
                total += tickets[i] < tickets[k]-1 ? tickets[i] : tickets[k]-1;
            }
        }
        return total;
    }
};