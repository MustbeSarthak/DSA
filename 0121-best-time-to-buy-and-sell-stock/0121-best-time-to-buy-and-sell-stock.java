class Solution {
    public int maxProfit(int[] prices) {
        int current, maxProfit = 0;
        int minPrice = prices[0];

        for(current = 0; current < prices.length; current++){
            if(minPrice > prices[current]){
                minPrice = prices[current];
            }else{
                int profit = prices[current] - minPrice;

                if(profit > maxProfit){
                    maxProfit = profit;
                }

            }
           
        }
        return maxProfit;
    }
}

