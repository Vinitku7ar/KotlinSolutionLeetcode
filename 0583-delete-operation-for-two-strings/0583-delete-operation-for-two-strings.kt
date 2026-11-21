class Solution {
    fun helper(w1:String , w2:String , i :Int , j :Int,dp:Array<IntArray>):Int{
         if(i==w1.length || j==w2.length){
            return 0
         }
         if(dp[i][j]!=-1){
            return dp[i][j]
         }
         if(w1[i]==w2[j]){
            dp[i][j]= 1+helper(w1,w2,i+1,j+1,dp)
            return dp[i][j]
         }
         else{
            dp[i][j]= maxOf(helper(w1,w2,i+1,j,dp),helper(w1,w2,i,j+1,dp))
            return dp[i][j]
         }
    }
    fun minDistance(word1: String, word2: String): Int {
        val dp = Array(word1.length){IntArray(word2.length){-1}}
        val count = helper(word1,word2,0,0,dp)
        return (word1.length-count) + (word2.length-count)
    }
}