class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], totalMaxProfit = 0;
        for(int currPrice: prices){
            minPrice = Math.min(minPrice, currPrice);
            totalMaxProfit = Math.max(totalMaxProfit, currPrice - minPrice);
        }
        return totalMaxProfit;
    }
}