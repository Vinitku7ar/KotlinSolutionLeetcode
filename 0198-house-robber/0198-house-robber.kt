class Solution {
    fun helper(nums:IntArray,i :Int,dp:IntArray):Int{
        if(i >= nums.size){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i]
        }
        val rob1 = nums[i]+helper(nums,i+2,dp)
        val rob2= 0+helper(nums,i+1,dp)

        dp[i]=maxOf(rob1,rob2)
        return dp[i]
    }
    fun rob(nums: IntArray): Int {
        val dp = IntArray(nums.size+1){-1}
       return  helper(nums,0,dp)
    }
}