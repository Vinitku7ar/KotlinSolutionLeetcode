class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val row = obstacleGrid.size
        val col = obstacleGrid[0].size
        val dp = Array(row){IntArray(col){-1}}

     

        for( i in row-1 downTo 0){
            for( j in col-1 downTo 0){
              if(obstacleGrid[i][j] == 1){
                dp[i][j]=0
              }
              else if( i == row-1 && j ==col-1){
                dp[i][j]=1
              }
              else{

              val right = if(j+1<col) dp[i][j+1] else 0
              val down = if(i+1<row)  dp[i+1][j] else 0

              dp[i][j]=right+down
              }

              


            }
        }

        return dp[0][0]
        
        
    }        
}