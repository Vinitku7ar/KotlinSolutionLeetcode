class Solution {
    fun helper(a : Int , coins : IntArray,index : Int,dp:Array<IntArray>):Int{
        //base case 
        if( a==0){
            return 1
        }
        if(dp[index][a]!=-1){
            return dp[index][a]
        }

        var count =0
        for(i in index until coins.size){
            if(a>=coins[i]){
               count+=helper(a-coins[i],coins,i,dp)
            }
        }
        dp[index][a]=count
        return dp[index][a]
    }
    fun change(amount: Int, coins: IntArray): Int {
        val dp =Array(coins.size){IntArray(amount+1){-1}}
        return helper(amount , coins,0,dp)
    }
}