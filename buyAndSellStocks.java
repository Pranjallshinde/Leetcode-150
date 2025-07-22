class Solution {
    public int buyAndSellStocks(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        int buyPrice = prices[0];

        for(int i = 1; i < n; i++){
            int currProfit = prices[i] - buyPrice;

            if(currProfit > maxProfit){ //update maxprpfit if higher value found
                maxProfit = currProfit;
            } 

            if(buyPrice > prices[i]){ //update buy price if lower value found
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
