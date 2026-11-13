class Solution { 

    fun helper(row:Int , col : Int, m : Int , n : Int, dp : Array<IntArray>):Int{
        //base case

      
        if( row == m-1 && col ==n-1 ){
            return 1 
        }
        //outside ie no answer
        if( row>=m || col >=n){
            return 0
        }

          if(dp[row][col] != -1){
            return dp[row][col]
        }

        //down call 
        val down = helper(row+1, col, m ,n,dp)
        //right
        val right = helper(row,col+1, m , n,dp)

         dp[row][col] =down+right
        

         return dp[row][col]
        
    }

    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m) { IntArray(n) { -1 } }
        return helper( 0 , 0 , m , n,dp)
    }
}