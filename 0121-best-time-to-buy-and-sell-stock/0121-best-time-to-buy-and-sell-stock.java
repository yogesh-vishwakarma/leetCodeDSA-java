class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int currPrice: prices){
            maxProfit = Math.max( maxProfit, currPrice - minPrice );
            minPrice = Math.min( minPrice, currPrice );
        }
        return maxProfit;
    }
}