// Problem:-
//Given an array of integers `prices` where `prices[i]` represents the stock price on day `i`, 
// find the maximum profit that can be achieved by buying on one day and selling on a later day.
//If no profit can be made, return `0`.

//Time Complexity: O(n)
//Space Complexity: O(1)

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit); // Output: Maximum Profit: 5
    }

}