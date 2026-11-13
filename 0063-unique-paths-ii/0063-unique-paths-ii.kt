class Solution {
    fun helper(obstacleGrid: Array<IntArray>, row: Int, col: Int, dp : Array<IntArray>): Int {

    val m = obstacleGrid.size
    val n = obstacleGrid[0].size

    // 1. Boundary check
    if (row >= m || col >= n) return 0

    if(dp[row][col] != -1) return dp[row][col]

    // 2. Obstacle check
    if (obstacleGrid[row][col] == 1) return 0

    // 3. Destination check
    if (row == m - 1 && col == n - 1) return 1

    val right = helper(obstacleGrid, row, col + 1,dp)
    val down = helper(obstacleGrid, row + 1, col,dp)

      dp[row][col]= right + down

      return dp[row][col]
}
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val row = obstacleGrid.size
        val col = obstacleGrid[0].size
        val dp = Array(row){IntArray(col){-1}}
        return helper(obstacleGrid,0,0,dp)
    }
}