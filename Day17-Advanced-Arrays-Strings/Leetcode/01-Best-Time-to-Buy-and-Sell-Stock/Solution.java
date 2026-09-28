class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {

            // Update the lowest buying price
            minPrice = Math.min(minPrice, price);

            // Calculate profit if we sell today
            int profit = price - minPrice;

            // Keep the maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
