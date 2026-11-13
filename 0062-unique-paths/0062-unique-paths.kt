class Solution {

    fun uniquePaths(m: Int, n: Int): Int {

        val dp = Array(m) { IntArray(n) }

        for (i in m-1 downTo 0) {
            for (j in n-1 downTo 0) {

                if (i == m-1 && j == n-1) {
                    dp[i][j] = 1
                }
                else {

                    val down = if (i+1 < m) dp[i+1][j] else 0

                    val right = if (j+1 < n) dp[i][j+1] else 0

                    dp[i][j] = down + right
                }
            }
        }

        return dp[0][0]
    }
}