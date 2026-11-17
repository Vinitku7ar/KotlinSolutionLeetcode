class Solution {

    fun maxProfit(prices: IntArray): Int {

        val n = prices.size
        val dp = Array(n) { IntArray(2) { -1 } }

        return helper(0, 1, prices, dp)
    }

    fun helper(
        day: Int,
        buy: Int,
        prices: IntArray,
        dp: Array<IntArray>
    ): Int {

        // Base case
        if (day == prices.size) {
            return 0
        }

        // Already calculated
        if (dp[day][buy] != -1) {
            return dp[day][buy]
        }

        var profit = 0

        if (buy == 1) {

            // Buy or Skip
            val take = -prices[day] +
                    helper(day + 1, 0, prices, dp)

            val skip = helper(day + 1, 1, prices, dp)

            profit = maxOf(take, skip)

        } else {

            // Sell or Hold
            val sell = prices[day]+helper(day+1, 1 , prices,dp)

            val hold = helper(day + 1, 0, prices, dp)

            profit = maxOf(sell, hold)
        }

        dp[day][buy] = profit

        return profit
    }
}