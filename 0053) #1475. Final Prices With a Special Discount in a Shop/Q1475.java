class Solution1475 {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for(int i = 0 ; i<prices.length; i++){
            if(i==prices.length-1){
                    result[i]= prices[i];
                    break;
                }
            for(int  j = i+1; j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    result[i]=prices[i]-prices[j];
                    break;
                }
                else result[i]= prices[i];
            }
        }
        return result;
    }
}