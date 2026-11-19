class Solution {
    fun helper(stones :IntArray , index : Int , target : Int,sum :Int,dp:Array<IntArray>):Int{
        //base case 
        if(index==stones.size){
            return sum 
        }
        if(dp[index][sum]!=-1){
            return dp[index][sum]
        }
        val exclude = helper(stones,index+1,target,sum,dp)

        var include =0

        if(sum+stones[index]<=target){
           include=helper(stones,index+1,target,sum+stones[index],dp)
        }

        dp[index][sum] =maxOf(exclude,include)
        return dp[index][sum]
    }
    fun lastStoneWeightII(stones: IntArray): Int {
        val total = stones.sum()
        val target = total/2
        val dp = Array(stones.size){IntArray(target+1){-1}}

        val ans = helper(stones,0,target,0,dp)

        return total-ans*2

    }
}