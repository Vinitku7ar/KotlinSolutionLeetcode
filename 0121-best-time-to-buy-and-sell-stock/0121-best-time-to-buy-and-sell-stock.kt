class Solution {
    fun maxProfit(prices: IntArray): Int {

        var mini = prices[0]
        var profit = 0
        var maxi = 0

        for (i in 1 until prices.size) {

            mini = minOf(prices[i], mini)

            profit = prices[i] - mini

            maxi = maxOf(profit, maxi)
        }

        return maxi
    }
}