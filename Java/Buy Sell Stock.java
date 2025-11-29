// Solved Sep 07 2025
//Another 2 pointer
class Solution {
    public int maxProfit(int[] prices) {
        int y = 0;
        int maxProfit = 0;
        for(int x = 0; x < prices.length; x++){
            if(prices[x] < prices[y]){
                y = x;
            }
            if(prices[x] - prices[y] > maxProfit){
                maxProfit = prices[x] - prices[y];
            }
        }
        return maxProfit;
    }
}
