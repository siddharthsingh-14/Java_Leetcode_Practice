class Solution121 {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int  profit = 0;
        int tempprofit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]<minprice){
                minprice = prices[i];
            }
            tempprofit = prices[i]-minprice;

            if(profit<tempprofit){
                profit = tempprofit;
            }
        }
        return profit;
    }
}