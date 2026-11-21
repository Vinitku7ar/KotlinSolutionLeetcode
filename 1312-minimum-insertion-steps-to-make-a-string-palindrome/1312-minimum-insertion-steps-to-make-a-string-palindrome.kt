class Solution {
    fun helper(s : String , i: Int , j :Int,dp:Array<IntArray>):Int{
        if(i>j){
            return 0
        }
        if(i==j){
            return 1
        }
        if(dp[i][j]!=-1){
            return dp[i][j]
        }
        if(s[i]==s[j]){
            dp[i][j]= 2+helper(s, i+1,j-1,dp)
        }
        else{
            dp[i][j]= maxOf(helper(s,i+1,j,dp),helper(s,i,j-1,dp))
        }
        return dp[i][j]
    }
    fun minInsertions(s: String): Int {
        val n = s.length
        val dp =Array(n){IntArray(n){-1}}
        var count=helper(s, 0 , s.length-1,dp)

        return s.length-count
    }
}