class Solution {

    fun maxProfit(prices: IntArray): Int {

        val n = prices.size

        val dp = Array(n) {
            Array(2) {
                IntArray(3) { -1 }
            }
        }

        return helper(0, 1, 2, prices, dp)
    }

    fun helper(
        day: Int,
        buy: Int,
        cap: Int,
        prices: IntArray,
        dp: Array<Array<IntArray>>
    ): Int {

        // Base case
        if (day == prices.size || cap == 0) {
            return 0
        }

        // Already calculated
        if (dp[day][buy][cap] != -1) {
            return dp[day][buy][cap]
        }

        var profit = 0

        if (buy == 1) {

            // Buy or Skip
            val take = -prices[day] +
                    helper(day + 1, 0, cap, prices, dp)

            val skip = helper(day + 1, 1, cap, prices, dp)

            profit = maxOf(take, skip)

        } else {

            // Sell or Hold
            val sell = prices[day] +
                    helper(day + 1, 1, cap - 1, prices, dp)

            val hold = helper(day + 1, 0, cap, prices, dp)

            profit = maxOf(sell, hold)
        }

        dp[day][buy][cap] = profit

        return profit
    }
}